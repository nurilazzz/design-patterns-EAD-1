package kz.strategy.problem1;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
