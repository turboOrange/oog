package oog;

import java.io.*;
import java.util.*;

import oog.syntax.analysis.*;
import oog.macros.*;
import oog.syntax.node.*;

public class CodeGenerator extends DepthFirstAdapter {

    // fields

    private Macros macros = new Macros();

    private List<Macro> stms;
    private List<Macro> exps;

    // static method to generate code
    public static void generate(Node tree) {

        CodeGenerator generator = new CodeGenerator();
        generator.visit(tree);
    }

    // private constructor to prevent external instances
    private CodeGenerator() {
    }

    private void visit(Node node) {

        if (node != null) {
            node.apply(this);
        }
    }

    @Override
    public void caseAEqualModifier(AEqualModifier node) {
        MModifier mModifier = macros.newModifier();
        mModifier.addOperator(" = ");
        mModifier.addVariable(node.getIdent().getText());
        mModifier.addValue(node.getNum().getText());
        this.exps.add(mModifier);
    }

    @Override
    public void caseAMinusModifier(AMinusModifier node) {
        MModifier mModifier = macros.newModifier();
        mModifier.addOperator("-");
        mModifier.addVariable(node.getIdent().getText());
        mModifier.addValue(node.getNum().getText());
        this.exps.add(mModifier);
    }

    @Override
    public void caseAPlusModifier(APlusModifier node) {
        MModifier mModifier = macros.newModifier();
        mModifier.addOperator("+");
        mModifier.addVariable(node.getIdent().getText());
        mModifier.addValue(node.getNum().getText());
        this.exps.add(mModifier);
    }

    @Override
    public void caseAModifierlist(AModifierlist node){
        List<PModifier> pModifiers = node.getModifiers();
        for(PModifier pModifier : pModifiers)
            visit(pModifier);
    }

    @Override
    public void caseAExitstm(AExitstm node){
        MIfstatement mIfstatement = macros.newIfstatement();
        mIfstatement.addExit(node.getNum().getText());
        mIfstatement.addNextevent(node.getIdent().getText());
        List<Macro> oldExps = this.exps;
        this.exps = new ArrayList<>();
        visit(node.getModifierlist());
        mIfstatement.addAllModifiers(this.exps);
        this.exps = oldExps;
        this.exps.add(mIfstatement);
    }

    @Override
    public void caseAExitlist(AExitlist node){
        for(PExitstm pExitstm: node.getExitstm())
            visit(pExitstm);
    }

    @Override
    public void caseAEventdef(AEventdef node){
        MEventif mEventif = macros.newEventif();
        mEventif.addCurrentevent(node.getIdent().getText());
        List<Macro> oldExps = this.exps;
        this.exps = new ArrayList<>();
        visit(node.getExitlist());
        mEventif.addAllStm(this.exps);
        this.exps = oldExps;
        this.stms.add(mEventif);
    }

    @Override
    public void caseAVariabledef(AVariabledef node){
        MVariable mVariable = macros.newVariable();
        mVariable.addDef(node.getDefault().getText());
        mVariable.addMin(node.getMin().getText());
        mVariable.addMax(node.getMax().getText());
        mVariable.addName(node.getIdent().getText());
        if(Objects.equals(node.getVisibility().getText(), "visible"))
            mVariable.addVisible("1");
        else
            mVariable.addVisible("0");
        this.stms.add(mVariable);
    }

    
    @Override
    public void caseAProgram(AProgram node) {
        MMainClass mainClass = this.macros.newMainClass();

        this.stms = new LinkedList<>();
        for (PVariabledef pVariabledef : node.getVariabledefs()) {
            visit(pVariabledef);
        }

        mainClass.addAllVar(this.stms);

        this.stms = new LinkedList<>();
        for (PEventdef pEventdef : node.getEventdefs()) {
            visit(pEventdef);
        }

        mainClass.addAllStm(this.stms);

        this.stms = null;

        try {
            FileWriter fileWriter = new FileWriter("Main.java");
            fileWriter.write(mainClass.build());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("IO ERROR:" + e.getMessage());
        }
    }
}