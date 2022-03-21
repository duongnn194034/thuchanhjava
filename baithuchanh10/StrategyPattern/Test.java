package baithuchanh10.StrategyPattern;

public class Test {
    public static void main(String args[]) {
        
        King kingAlex = new King();
        Queen queenBarbara = new Queen();
        Knight sirCid = new Knight();
        Troll trollDave = new Troll();
        
        SwordBehavior swordExcalibur = new SwordBehavior();
        AxeBehavior axeTomahawk = new AxeBehavior();
        KnifeBehavior knifeGamma = new KnifeBehavior();
        ClubBehavior clubObvilion = new ClubBehavior();

        kingAlex.setWeapon(swordExcalibur);
        queenBarbara.setWeapon(knifeGamma);
        sirCid.setWeapon(axeTomahawk);
        trollDave.setWeapon(clubObvilion);

        kingAlex.fight();
        queenBarbara.fight();
        sirCid.fight();
        trollDave.fight();

        sirCid.setWeapon(swordExcalibur);
        sirCid.fight();


    }
}
