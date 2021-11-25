package kz.strategy.problem1;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }

    
    public void fight() {
        System.out.println("Queen's turn!");
    }
}
