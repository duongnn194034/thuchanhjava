package baithuchanh10.StrategyPattern;

public class SwordBehavior extends WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println(" slash!");
    }
}
