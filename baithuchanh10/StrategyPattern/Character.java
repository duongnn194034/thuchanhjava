package baithuchanh10.StrategyPattern;

public class Character {
    public WeaponBehavior weapon;

    public void setWeapon (WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    
    public void fight () {
        weapon.useWeapon();
    }
}
