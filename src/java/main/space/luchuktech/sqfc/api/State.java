package space.luchuktech.sqfc.api;

public interface State<K> {


    <T> T getVariable(K key);

    boolean setVariable(K key, Object o);

}
