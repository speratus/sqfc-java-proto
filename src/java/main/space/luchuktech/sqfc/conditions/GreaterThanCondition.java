package space.luchuktech.sqfc.conditions;

import space.luchuktech.sqfc.api.Condition;
import space.luchuktech.sqfc.api.State;

import java.util.Optional;

public class GreaterThanCondition<K, S extends State<K>> implements Condition<S> {

    public K key;

    public int value;

    /**
     *
     * @param s The Current state object
     * @return
     */
    @Override
    public boolean isTrue(S s) {
        Optional<Integer> opt = s.getVariable(this.key, Integer.class);

        return opt.map(i -> i > this.value).orElse(false);
    }
}
