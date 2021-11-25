package kz.observer.problem1.observerSubject;

public abstract class Observer {
    abstract void update();

    abstract String getName();
    abstract public Subject getSubject();

    abstract void setSubject(Subject subject);
    abstract void setObserverState(State observerState);
}
