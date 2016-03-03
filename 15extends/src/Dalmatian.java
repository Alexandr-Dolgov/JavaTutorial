import p.Dog;

public class Dalmatian extends Dog {

    private int quantitySpots;

    public void m() {
        this.run();
        String s = this.color;
        double w = this.weight;
    }

    public String toString() {
        return super.toString() + ", quantitySpots = " + quantitySpots;
    }

}
