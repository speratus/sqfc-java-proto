package space.luchuktech.sqfc.api;

@FunctionalInterface
public interface ComplexCondition<S extends State<?>> {

    /**
     *
     * @param conditions
     * @return
     */
    boolean isTrue(Condition<S>... conditions);

}
