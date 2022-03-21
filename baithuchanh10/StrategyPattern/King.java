package baithuchanh10.StrategyPattern;

public class King extends Character {
    @Override
    public void fight () {
        System.out.print("The king");
        super.fight();
    }
}
