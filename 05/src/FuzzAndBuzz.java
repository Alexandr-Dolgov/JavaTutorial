public class FuzzAndBuzz {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i = i + 1)
            if (i % 3 == 0 && i % 5 == 0) {/*Решил с помощью "жучка".
            Оператор if проверив i на кратность 3 и 5 не доходил до проверки и 3 и 5.
            */
                System.out.println("fuzz buzz");
            } else if (i % 3 == 0) {
                System.out.println("fuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
    }
}
