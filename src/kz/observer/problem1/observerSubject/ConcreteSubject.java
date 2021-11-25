package kz.observer.problem1.observerSubject;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    private ArrayList<Observer> observers = new ArrayList();
    private State state;
    public ConcreteSubject(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        notifyUsers();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
        System.out.println("------User: " + state.userName);
        System.out.println("------Added new subscriber:" + o.getName());
    }

    @Override
    public void detach(Observer o) {
        int index  = observers.indexOf(o);
        if(index >= 0) {
            observers.remove(index);
            o.setObserverState(new State(state.userName));
        }
        System.out.println("------User: " + state.userName);
        System.out.println("------Deleted subscriber:" + o.getName());
    }

    @Override
    public void notifyUsers() {
        System.out.println("------User: " + state.userName);
        System.out.println("------Notifying for all the subscribers");
        for (Observer o : observers) {
            o.setObserverState(state);
            o.update();
        }
    }
}
