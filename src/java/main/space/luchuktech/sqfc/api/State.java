package space.luchuktech.sqfc.api;

/**
 *
 * @param <K>
 */
public interface State<K> {


    /**
     * Returns the requested variable. Pass the `returnType` class to ensure that this method returns the value with
     * the correct type.
     * @param key The key of the object to return
     * @param returnType The Expected Class of the return type
     * @return The value of the requested key. Null if the value doesn't exist.
     * @param <T> The expected type of the return value.
     */
    <T> T getVariable(K key, Class<T> returnType);

    /**
     * Sets a variable of the state.
     * @param key The key of the object
     * @param o The value of the state
     * @return True if the value was successfully set. False, otherwise.
     */
    boolean setVariable(K key, Object o);

}
