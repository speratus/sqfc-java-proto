package space.luchuktech.sqfc.conditions;

import space.luchuktech.sqfc.api.Condition;
import space.luchuktech.sqfc.api.State;

import java.util.Optional;

public class EqualsCondition<K, S extends State<K>> implements Condition<S> {

    public K focus;

    public Object value;

    @Override
    public boolean isTrue(S s) {
        Optional<Object> opt = s.getVariableAsObject(this.focus);

        return opt.map(o -> o.equals(this.value)).orElse(false);
    }
}
