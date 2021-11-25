package kz.observer.problem1.observerSubject;

public class State {
    public String s;
    public String userName;

    public State(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "State{" +
                "s=" + s +
                '}';
    }
}
