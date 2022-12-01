package space.luchuktech.sqfc;

import space.luchuktech.sqfc.api.State;

import java.util.HashMap;
import java.util.Optional;

public class StringKeyMapState implements State<String> {

    private final HashMap<String, Object> storage;

    public StringKeyMapState() {
        storage = new HashMap<>();
    }

    @Override
    public <T> Optional<T> getVariable(String key, Class<T> returnType) {
        Object val = this.storage.get(key);

        if (val == null) {
            return Optional.empty();
        }

        return Optional.of(returnType.cast(val));
    }

    @Override
    public Optional<Object> getVariableAsObject(String key) {
        var val = this.storage.get(key);

        if (val == null) {
            return Optional.empty();
        }

        return Optional.of(val);
    }

    @Override
    public boolean setVariable(String key, Object o) {
        this.storage.put(key, o);
        return true;
    }
}
