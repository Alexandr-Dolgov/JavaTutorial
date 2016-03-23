public class Warrior extends Unit {

    private int i;

    //    public double uantityHarvest;
    //    public double quantityHarvestHour;
    //
    //        super();

    public Warrior(double d){
        super(d);
        i = 100;
    }

    public Warrior(){
        super(3);
    }

    @Override
    public String toString() {
        String s = "" + 1 + super.toString() + "int" + i;
        System.out.println(s);
        return s;
    }
}
