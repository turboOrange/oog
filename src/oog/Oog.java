package oog;

import oog.CodeGenerator;
import oog.syntax.lexer.Lexer;
import oog.syntax.lexer.LexerException;
import oog.syntax.node.Node;
import oog.syntax.parser.Parser;
import oog.syntax.parser.ParserException;

import java.io.*;
import java.util.Map;

public class Oog {
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                System.err.println("usage: event file");
                System.exit(1);
            }
            Parser parser = new Parser(new Lexer(new PushbackReader(new FileReader(args[0]), 1024)));

            Node tree = parser.parse();

            CodeGenerator.generate(tree);

        } catch (IOException e) {
            System.err.println("IO ERROR: " + e.getMessage());
            System.exit(1);
        } catch (LexerException e) {
            System.err.println("LEXICAL ERROR: " + e.getMessage());
            System.exit(1);
        } catch (ParserException e) {
            System.err.println("SYNTAX ERROR: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("UNCAUGHT BUG IN THE INTERPRETER!");
            System.exit(1);
        }
    }
}
