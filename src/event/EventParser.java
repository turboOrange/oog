package event;

import java.nio.file.Path;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import event.InterpreterException;
import event.syntax.analysis.*;
import event.syntax.node.*;


public class EventParser extends DepthFirstAdapter {

    EventParser() {
    }

    // utility methods

    private void visit(Node node) {

        if (node != null) {
            node.apply(this);
        }
    }

    private void setResult(Value value) {

      //  if (this.currentResult != null) {
      //      throw new InternalException("currentResult wasn't cleaned up");
      //  }

        this.currentResult = value;
    }

    // static method to interpret a tree
    public static Map<String, Map<String, String>> interpret(Node tree) {

        EventParser interpreter = new EventParser();
        interpreter.visit(tree);
        return interpreter.getEvents();
    }
    // fields

    private Value currentResult;

    private Map<String, Map<String, String>> events;

    public Map<String, Map<String, String>> getEvents(){
        return this.events;
    }

    @Override
    public void caseAIndirectAssosiation(AIndirectAssosiation node) {
        String fileName = node.getString().getText();
        String content = "";
        try{
            content = Files.readString(Paths.get(fileName));
        }catch(Exception e) {
            System.out.println("Exeption in caseAIndirectAssosiation");
        }
        Map.Entry<String, String> out = new AbstractMap.SimpleEntry<>(node.getIdent().getText(), content);
        MapEntryValue value = new MapEntryValue(out);
        setResult(value);
    }

    @Override
    public void caseADirectAssosiation(ADirectAssosiation node){
        Map.Entry<String, String> out = new AbstractMap.SimpleEntry<>(node.getIdent().getText(),
                                  node.getString().getText().replace("\"", ""));
        MapEntryValue value = new MapEntryValue(out);
        setResult(value);
    }

    @Override
    public void caseAChoiceAssosiation(AChoiceAssosiation node){
        Map.Entry<String, String> out = new AbstractMap.SimpleEntry<>("choice__" + node.getNum().getText(),
                node.getString().getText().replace("\"", ""));
        MapEntryValue value = new MapEntryValue(out);
        setResult(value);
    }

    @Override
    public void caseAAgregation(AAgregation node){
        Map<String, String> out = new HashMap<>();
        for(PAssosiation assosiation: node.getAssosiations()){
            this.visit(assosiation);
            out.put(currentResult.getMapEntryValue().getKey(), currentResult.getMapEntryValue().getValue());
        }
        this.currentResult = null;
        setResult(new MapValue(out));
    }

    @Override
    public void caseAFirstEvent(AFirstEvent node) {
        Map<String, String> eventContent = new HashMap<>();
        this.visit(node.getAgregation());
        for(Object assosiationObject : this.currentResult.getMapValue().keySet()){
            eventContent.put((String) assosiationObject, this.currentResult.getMapValue().get(assosiationObject));
        }
        this.currentResult = null;
        eventContent.put("type", node.getType().getText());
        this.events.put("first__" + node.getName().getText(), eventContent);
    }

    @Override
    public void caseANormalEvent(ANormalEvent node)
    {
        Map<String, String> eventContent = new HashMap<>();
        this.visit(node.getAgregation());
        for(Object assosiationObject : this.currentResult.getMapValue().keySet()){
            eventContent.put((String) assosiationObject, this.currentResult.getMapValue().get(assosiationObject));
        }
        this.currentResult = null;
        eventContent.put("type", node.getType().getText());
        this.events.put(node.getName().getText(), eventContent);
    }

    @Override
    public void caseAProgram(AProgram node){
        this.events = new HashMap<>();
        for(PEvent pEvent : node.getEvents()){
            visit(pEvent);
        }
    }
}