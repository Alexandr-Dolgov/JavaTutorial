import java.util.Random;

public class MainA {

    public static void main(String[] args) {//метод main генерирует массив, поместил в один класс
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i < 5; i = i + 1) {
            a[i] = random.nextInt();
        }
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(a[i]);//в условии задачи не сказано, вывел для удобства
        }

        int max = MainA.max(a);
        System.out.println("01 максимальный элемент массива = " + max);

        int min = MainA.min(a);
        System.out.println("02 минимальный элемент массива = " + min);

        int imin = MainA.imin(a);
        System.out.println("03 индекс минимального элемента = " + imin);

        int imax = MainA.imax(a);
        System.out.println("04 индекс максимального элемента = " + imax);

        System.out.println("05 новый массив с элементами в обратном порядке:");
        int[] a1 = MainA.reverse(a);

        int sum = MainA.qantitiPositive(a);
        System.out.println("06 количество положительных элементов в массиве = " + sum);

        System.out.println("07 массив отсортированный по возрастанию:");
        int[] a2 = MainA.sortAscending(a);

        double sumElement = MainA.sum(a);
        System.out.println("09 сумма всех элементов массива = " + sumElement);

        double multiplicationElement = MainA.multiplication(a);
        System.out.println("10 произведение всех элементов массива = " + multiplicationElement);
    }

    //    01 static int min(int[] a) //метод возвращает минимальный элемент массива а
    static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    //    02 static int max(int[] a) //метод возвращает максимальный элемент массива а
    static int max(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i = i + 1) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //    03 static int indexMin(int[] a) //метод возвращает индекс минимального элемент массива а
    static int imin(int[] a) {
        int imin = a[0];

        for (int i = 1; i < a.length; i = i + 1) {
            if (a[i] < imin) {
                imin = i;
            }
        }
        return imin;
    }

    //    04 static int indexMax(int[] a) //метод возвращает индекс максимального элемент массива а
    static int imax(int[] a) {
        int imax = a[0];

        for (int i = 1; i < a.length; i = i + 1) {
            if (a[i] > imax) {
                imax = i;
            }
        }
        return imax;

    }

    //    05 static int[] reverse(int[] a) //метод возвращает новый массив, в которым элементы в обратном порядке
    static int[] reverse(int[] a) {
        for (int i = a.length - 1; i >= 0; i = i - 1) {
            System.out.println(a[i]);
        }
        return a;
    }

    //06 static int quantityPositiveElement(int[] a) //метод возвращает количество положительных элементов массива а
    static int qantitiPositive(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] > 0) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    //    07 static int[] sortAscending(int[] a)//метод возвращает массив отсортированный по возрастанию
    static int[] sortAscending(int[] a) {
        for (int i = 0; i < a.length; i = i + 1) {
            for (int j = a.length - 1; j > i; j = j - 1) {
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(a[i]);

        }
        return a;
    }

//    08 static int[] sortDescending(int[] a)//метод возвращает массив отсортированный по убыванию

    //    09 static double sum(double[] a)//сумма всех элементов
    static double sum(int[] a) {//// TODO: 20.02.2016 изменил тип т.к. массив формируется тип int
        double sumElement = 0;
        for (int i = 0; i < a.length; i = i + 1) {
            sumElement = sumElement + a[i];
        }
        return sumElement;
    }

    //    10 static double multiplication(double[] a) //произведение всех элементов
    static double multiplication(int[] a) {
        double multiplicationElement = 1;
        for (int i = 0; i < a.length; i = i + 1) {
            multiplicationElement = multiplicationElement * a[i];
        }
        return multiplicationElement;
    }
}



