public class Rock {

    int i;
    int j = 10;
    String a = "s";

    Rock(int i){
        this.i = i;
        System.out.println("Rock " + i);
    }

    @Override
    public String toString() {
        return "i = " + i + " j =" + j;
    }
}
