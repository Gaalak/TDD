package Java.genericite.exogenericite.primarykeys;

import java.util.HashMap;
import java.util.Map;

public class Database<T,V> {


    private final Map<V,T> values = new HashMap<>();

    public Database(){}

    public void add(T type,V uniqueId) {
        values.put(uniqueId,type);
    }

    public Map<V, T> getValues() {
        return values;
    }

    public T get(V uniqueId) {
        return values.get(uniqueId);
    }
}
