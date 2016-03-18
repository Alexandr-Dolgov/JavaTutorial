public class Warrior extends Unit {

    private int quantityUnitAttack;
    private int howMuchBlowApp;

    public int unit(){
        Unit unit = new Unit();
        //unit.point();
        return 0;
    }

    public int getQuantityUnitAttack(){
        return quantityUnitAttack;
    }

    public String toString(){
        return super.toString() + quantityUnitAttack + howMuchBlowApp;
    }
}
