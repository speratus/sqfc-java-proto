package space.luchuktech.sqfc.api;

import java.util.Set;

public interface Step<S extends State<?>, C extends Condition<S>, T extends Transform<S>> {

    Step<S, C, T> nextStep();

    EvaluationResult evaluate(Set<C> conditions, S state);

    S resultingState();

    Set<C> conditions();

    T getTransform();

}
