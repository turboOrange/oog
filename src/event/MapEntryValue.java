package event;

import java.util.List;
import java.util.Map;

public class MapEntryValue extends Value {

	private Map.Entry<String, String> value;

	public MapEntryValue(Map.Entry<String, String> value) {

		this.value = value;
	}

	Map.Entry<String, String> getValue() {
		return this.value;
	}

	@Override
	public Map<String, String> getMapValue(){
		throw new InternalException("value is not map");
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
		return this.value;
	}

	@Override
	public String toString() {
		StringBuilder returnedValue = new StringBuilder();
		return this.value.getKey() + " : " + this.value.getValue();
	}
}
