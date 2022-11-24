package space.luchuktech.sqfc.api;

public interface State<K> {


    <T> T getVariable(K key, Class<T> returnType);

    boolean setVariable(K key, Object o);

}
