package space.luchuktech.sqfc;

public interface State<K> {


    public <T> T getVariable(K key);

    public boolean setVariable(K key, Object o);

}
