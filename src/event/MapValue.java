package event;

import java.util.List;
import java.util.Map;

public class MapValue extends Value {

	private Map<String, String> value;

	public MapValue(Map<String, String> value) {

		this.value = value;
	}

	Map<String, String> getValue() {
		return this.value;
	}

	@Override
	public String getStringValue() {

		throw new InternalException("value is not string");
	}

	@Override
	public List<Object> getListValue(){
		throw new InternalException("value is not list");
	}

	@Override
	public Map.Entry<String, String> getMapEntryValue(){
		throw new InternalException("value is not map entry.");
	}

	@Override
	public Map<String, String> getMapValue(){
		return this.value;
	}

	@Override
	public String toString() {
		StringBuilder returnedValue = new StringBuilder();
		return "todo";
	}
}
