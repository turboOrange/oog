package event;
import event.syntax.node.*;
public class InterpreterException extends RuntimeException {

	public InterpreterException(String message, Token location) {
		super("[" + location.getLine() + "," + location.getPos() + "] " + message);
	}

}
