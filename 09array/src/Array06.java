import java.util.Scanner;

public class Array06 {
    //06 вывести на экран только отрицательные кратные 5 элементы не меньше -100
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите количество элементов в массиве:");
        int longth = scanner.nextInt();
        int[] a = new int[longth];
        System.out.println("введите элементы массива:");
        for (int i =0; i<longth; i=i+1){
            a[i]=scanner.nextInt();
        }
        for (int i = 0; i<longth; i=i+1){
            System.out.println(a[i]);
        }
        System.out.println("отрицательные кратные 5 на меньше -100");
        for (int i=0; i<longth; i=i+1){
            if (a[i]%5==0 && -100<a[i]&& a[i]<0){//// TODO: 15.02.2016 -100<х<200 
                System.out.println(a[i]);
            }
        }
    }
}
