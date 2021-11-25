package kz.strategy.problem1;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cutting with a knife");
    }
}
