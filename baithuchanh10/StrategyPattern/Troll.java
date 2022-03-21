package baithuchanh10.StrategyPattern;

public class Troll extends Character {
    @Override
    public void fight () {
        System.out.print("The troll");
        super.fight();
    }
}
