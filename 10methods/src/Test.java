import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i<5; i=i+1){
            a[i] = random.nextInt();
        }
        for (int i = 0; i<5; i=i+1){
            System.out.println(a[i]);
        }
    }
}
