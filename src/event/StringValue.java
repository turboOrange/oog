package event;
import java.util.*;
import event.syntax.node.*;

public class StringValue extends Value {

	private String value;

	public StringValue(String value) {

		this.value = value;
	}
	String getValue() {
		return this.value;
	}

	@Override
	public Map<String, String> getMapValue(){
		throw new InternalException("value is not map");
	}

	@Override
	public String getStringValue() {

		return this.value;
	}
	public Map.Entry<String, String> getMapEntryValue(){
		throw new InternalException("value is not map entry");
	}
	@Override
	public List<Object> getListValue(){
		throw new InternalException("value is not list");
	}

	@Override
	public String toString() {
		return this.value;
	}
}
