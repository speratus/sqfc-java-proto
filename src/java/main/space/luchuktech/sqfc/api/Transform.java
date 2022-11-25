package space.luchuktech.sqfc.api;

/**
 * A generic interface for transforming a state object.
 * @param <T>
 */
@FunctionalInterface
public interface Transform<T extends State> {

    /**
     * Performs some operation on the given state object. Precisely what is determined by the developer.
     * @param state The current state of the program.
     * @return The transformed state object.
     */
    T transform(T state);

}
