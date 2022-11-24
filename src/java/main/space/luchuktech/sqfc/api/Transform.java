package space.luchuktech.sqfc.api;

@FunctionalInterface
public interface Transform<T extends State> {

    T transform(T state);

}
