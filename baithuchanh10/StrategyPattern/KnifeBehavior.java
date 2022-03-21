package baithuchanh10.StrategyPattern;

public class KnifeBehavior extends WeaponBehavior {
    @Override
    public void useWeapon () {
        System.out.println(" stab with knife!");
    }
}
