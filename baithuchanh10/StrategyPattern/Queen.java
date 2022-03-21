package baithuchanh10.StrategyPattern;

public class Queen extends Character {
    @Override
    public void fight () {
        System.out.print("The queen");
        super.fight();
    }
}
