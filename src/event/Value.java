package event;
import java.util.*;
import event.syntax.node.*;

public abstract class Value {

	abstract public String getStringValue();

	abstract public List<Object> getListValue();

	abstract public Map.Entry<String, String> getMapEntryValue();

	abstract public Map<String, String> getMapValue();

}
