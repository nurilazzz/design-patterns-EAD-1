package kz.strategy.problem1;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        Character queen = new Queen();
        queen.actionWithWeapon();
        queen.fight();

        System.out.println(" ");

        Character king = new King();
        king.actionWithWeapon();
        king.fight();

        System.out.println(" ");

        Character troll = new Troll();
        troll.actionWithWeapon();
        troll.fight();

        System.out.println(" ");

        Character knight = new Knight();
        knight.actionWithWeapon();
        knight.fight();

        System.out.println(" ");
    }
}
