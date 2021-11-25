package kz.strategy.problem1;

public abstract class Character {
    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public void actionWithWeapon() {
        weapon.useWeapon();
    }

    public abstract void fight();
}
