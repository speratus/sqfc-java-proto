package space.luchuktech.sqfc.api;

/**
 *
 * @param <S>
 */
@FunctionalInterface
public interface Condition<S extends State> {

    /**
     * Evaluates the condition and returns the result.
     * @param s The Current state object
     * @return True or false depending on the result of the evaluation.
     */
    boolean isTrue(S s);


}
