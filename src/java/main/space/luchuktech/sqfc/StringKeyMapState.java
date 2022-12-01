package space.luchuktech.sqfc;

import space.luchuktech.sqfc.api.State;

import java.util.HashMap;

public class StringKeyMapState implements State<String> {

    private final HashMap<String, Object> storage;

    public StringKeyMapState() {
        storage = new HashMap<>();
    }

    @Override
    public <T> T getVariable(String key, Class<T> returnType) {
        Object val = this.storage.get(key);

        if (val == null) {
            return null;
        }

        return returnType.cast(val);
    }

    @Override
    public boolean setVariable(String key, Object o) {
        this.storage.put(key, o);
        return true;
    }
}
