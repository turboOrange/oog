package event;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import event.syntax.lexer.*;
import event.syntax.node.*;
import event.syntax.parser.*;

public class Event {

	public static void main(String[] args) {
		Map<String, Map<String, String>> result;
		try {
			if (args.length != 1) {
				System.err.println("usage: event file");
				System.exit(1);
			}
			Parser parser = new Parser(new Lexer(new PushbackReader(new FileReader(args[0]), 1024)));
			Node tree = parser.parse();

			// get event info
			result = EventParser.interpret(tree);
			FileOutputStream fos = new FileOutputStream("events.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(result);
			oos.close();
			fos.close();

		} catch (IOException e) {
			System.err.println("IO ERROR: " + e.getMessage());
			System.exit(1);
		} catch (LexerException e) {
			System.err.println("LEXICAL ERROR: " + e.getMessage());
			System.exit(1);
		} catch (ParserException e) {
			System.err.println("SYNTAX ERROR: " + e.getMessage());
			System.exit(1);
		} catch (InterpreterException e) {
			System.err.println("RUNTIME ERROR: " + e.getMessage());
			System.exit(1);
		} catch (InternalException e) {
			e.printStackTrace();
			System.err.println("BUG IN THE INTERPRETER: " + e.getMessage());
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("UNCAUGHT BUG IN THE INTERPRETER!");
			System.exit(1);
		}
	}

}
