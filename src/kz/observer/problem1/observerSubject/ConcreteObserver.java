package kz.observer.problem1.observerSubject;

public class ConcreteObserver extends Observer{
    private State observerState;
    private String name;
    private Subject subject;
    public ConcreteObserver(Subject subject, String name){
        this.subject = subject;
        this.name = name;
    }

    State getObserverState() {
        return observerState;
    }

    void setObserverState(State observerState) {
        this.observerState = observerState;
    }

    public Subject getSubject() {
        return subject;
    }

    void setSubject(Subject subject) {
        this.subject = subject;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    void update() {
        System.out.println("Message:"+ observerState.s +",User: " + name);
    }
}
