import java.util.Random;

public class MainArr {
    //метод main генерирует массив, выводит на экран, вызывает метод max, возвращает...

//    static int variable(){
//        int j=3;
//        return j;
//    }


    public static void main(String[] args) {
        Random random = new Random();
        //int jj = MainArr.variable();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i = i + 1) {
            a[i] = random.nextInt();
            System.out.println(a[i]);
        }
        int max = Arr02.max(a);//вызвал метод max()
        System.out.println("максимальный элемент массива = " + max);

        int min = Arr01.min(a);
        System.out.println("минимальный элемент массива = "+min);

        int imin =Arr03.min(a);
        System.out.println("индекс минимального элемента = "+imin);

        int imax =Arr04.max(a);
        System.out.println("индекс максимального элемента = "+imax);
    }

    static void print(int[] a) {

    }

}
