package kz.observer.problem1;

import kz.observer.problem1.observerSubject.*;

public class Main {

    public static void main(String[] args) {
        Subject person=new ConcreteSubject(new State("Michel"));
        person.getState().s = "Hello my subscribers";
        Observer subscriber=new ConcreteObserver(person,person.getState().userName);
        Subject person1=new ConcreteSubject(new State("Jon"));
        person1.getState().s = "Hello my subscribers!!!";
        Observer subscriber2=new ConcreteObserver(person1,person1.getState().userName);
        Subject person2=new ConcreteSubject(new State("Bob"));
        person2.getState().s = "Hello my subscribers!!!#r3";
        Observer subscriber3=new ConcreteObserver(person2,person2.getState().userName);
        subscriber.getSubject().attach(subscriber2);
        subscriber.getSubject().notifyUsers();
        subscriber2.getSubject().attach(subscriber);
        subscriber2.getSubject().attach(subscriber3);
        subscriber2.getSubject().notifyUsers();
        subscriber2.getSubject().detach(subscriber);
        subscriber2.getSubject().notifyUsers();
        subscriber2.getSubject().getState().s = "vdfb";
        subscriber2.getSubject().notifyUsers();
    }
}
