package space.luchuktech.sqfc.api;

public interface Condition<S extends State> {

    boolean isTrue(S s);


}
