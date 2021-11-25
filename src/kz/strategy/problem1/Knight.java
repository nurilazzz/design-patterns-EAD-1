package kz.strategy.problem1;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }

    public void fight() {
        System.out.println("Knight's turn!");
    }
}
