public class Main {

    public static void main(String[] args) {
        Notebook n1 = new Notebook(2048, 2.47, true);
        //n1 - instance - экземпляр

        Notebook n2 = new Notebook(512, 1.47, false);
        Notebook n3 = new Notebook(64, 5.47, true);

        n3.turnOff();

    }

}
