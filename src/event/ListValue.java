package event;
import java.util.*;
import event.syntax.node.*;

public class ListValue extends Value {

	private List<Object> value;

	public ListValue(List<Object> value) {

		this.value = value;
	}
	public Map.Entry<String, String> getMapEntryValue(){
		throw new InternalException("value is not map entry");
	}

	@Override
	public Map<String, String> getMapValue(){
		throw new InternalException("value is not map");
	}

	List<Object> getValue() {
		return this.value;
	}

	@Override
	public String getStringValue() {

		throw new InternalException("value is not string");
	}

	@Override
	public List<Object> getListValue(){
		return this.value;
	}

	@Override
	public String toString() {
		StringBuilder returnedValue = new StringBuilder();
		for(Object element : this.value){
			returnedValue.append(element);
		}
		return returnedValue.toString();
	}
}
