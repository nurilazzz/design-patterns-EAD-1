package kz.observer.problem1.observerSubject;


public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUsers();

    State getState();
    void setState(State state);
}
