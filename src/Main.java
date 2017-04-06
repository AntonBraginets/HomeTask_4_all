import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_4_1();
        Task_4_2();
        Task_4_3();
        Task_4_4();
        Task_4_5();
        Task_4_6();
        Task_4_7();
        Task_4_8_a();
        Task_4_8_b();
        Task_4_8_c();
        Task_4_9_a();
        Task_4_9_b();
    }

    private static void Task_4_1() {
        System.out.println("Задание №4.1:");
        int lib[] = new int[35];
        int sum = 0;
        for (int i = 0; i < lib.length; i++) {
            lib[i] = new Random().nextInt(6000);
            sum += lib[i];
        }
        System.out.println("В библиотеке всего хранится " + sum + " книг.");
        if ((int) (sum / 100000) != 0)
            System.out.println("Количество книг в библиотеке является шестизначным числом");
        else
            System.out.println("Количество книг в библиотеке не является шестизначным числом.");
    }

    private static void Task_4_2() {
        System.out.println();
        System.out.println("Задание №4.2:");
        int marks[] = new int[10];
        System.out.print("Введите проходной бал: ");
        int acceptMark = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = new Random().nextInt(100);
            sum += marks[i];
        }
        System.out.println("\nОбщая сумма баллов спортсмена: " + sum);
        if (sum > acceptMark)
            System.out.println("Спортсмен проходит в следующий этап.");
        else
            System.out.println("Спортсмен не проходит в следующий этап.");
    }

    private static void Task_4_3() {
        System.out.println();
        System.out.println("Задание №4.3:");
        double res_array[] = new double[18];
        double max1 = res_array[0];
        double max2 = res_array[7];
        double max3 = res_array[13];
        System.out.print("Фигурист получил следующие оценки: ");
        for (int i = 0; i < res_array.length; i++) {
            int decimal = new Random().nextInt(9);
            res_array[i] = new Random().nextInt(7) + (double) decimal / 10; //Math.random() - от 0,00000... до 0,9999999...;
            System.out.print(res_array[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            if (max1 < res_array[i]) {
                max1 = res_array[i];
            }
        }
        System.out.println("Лучший результат в обязательной программе: " + max1);
        for (int i = 7; i < 12; i++) {
            if (max2 < res_array[i]) {
                max2 = res_array[i];
            }
        }
        System.out.println("Лучший результат в короткой программе: " + max2);
        for (int i = 13; i < res_array.length; i++) {
            if (max3 < res_array[i]) {
                max3 = res_array[i];
            }
        }
        System.out.println("Лучший результат в произвольной программе: " + max3 + "\n");
        if (max1 > max2 & max1 > max3)
            System.out.println("Лучший результат фигурист получил в обязательной программе.");
        else if (max2 > max1 & max2 > max3)
            System.out.println("Лучший результат фигурист получил в короткой программе.");
        else
            System.out.println("Лучший результат фигурист получил в произвольной программе.");
    }

    private static void Task_4_4() {
        System.out.println();
        System.out.println("Задание №4.4:");
        int N = new Random().nextInt(10) + 5;
        int array_length[] = new int[N];
        int array[] = new int[N];
        int count = 0;
        int max = array_length[0];
        System.out.println("Initial array:");
        for (int t = 0; t < array.length; t++) {
            array[t] = new Random().nextInt(10);
            System.out.print(array[t] + " ");
        }
        System.out.println();
        for (int i = 0; i < array_length.length; i++) {
            array_length[i] = 1;
            count = 1;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] == array[j + 1] - 1) {
                    count += 1;
                } else break;
            }
            array_length[i] = count;
            //System.out.print(array_length[i] + " "); - to see length
            if (max < array_length[i])
                max = array_length[i];
        }
        for (int i = 0; i < array_length.length; i++) {
            array_length[i] = 1;
            count = 1;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] - 1 == array[j + 1]) {
                    count += 1;
                } else break;
            }
            array_length[i] = count;
            //System.out.print(array_length[i] + " "); - to see length
            if (max < array_length[i])
                max = array_length[i];
        }
        System.out.println("\nMax quantity of consecutive numbers in this array is: " + max);
    }

    private static void Task_4_5() {
        System.out.println();
        System.out.println("Задание №4.5:");
        int N = new Random().nextInt(10);
        int array[] = new int[N];
        //int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int count = 0;
        System.out.println("Исходный массив: ");
        for (int j = 0; j < array.length; j++) {
            array[j] = new Random().nextInt(100) - 50;
            System.out.print(array[j] + " ");
        }
        System.out.println("\nНомера позиций простых чисел в заданном массиве: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 1)
                continue;
            else if (array[i] == 2 | array[i] == 3 | array[i] == 5) {
                System.out.print(i + " ");
                count += 1;
            } else if (array[i] % 2 != 0 & array[i] % 3 != 0 & array[i] % 5 != 0) {
                System.out.print(i + " ");
                count += 1;
            }
        }
        if (count == 0)
            System.out.println("Простых чисел нет");
    }

    private static void Task_4_6() {
        System.out.println();
        System.out.println("Задание №4.6:");
        int N = new Random().nextInt(5) + 5;
        int array[] = new int[N];
        int max_el_No = 0;
        int min_el_No = 0;
        System.out.println("Number of array elements: " + N);
        System.out.println("\nInitial array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                max_el_No = j;
            }
        }
        int min = array[0];
        for (int k = 0; k < array.length; k++) {
            if (min > array[k]) {
                min = array[k];
                min_el_No = k;
            }
        }
        System.out.println();
        array[max_el_No] = 0;
        array[min_el_No] = 0;
        System.out.println("\nMax element #" + (max_el_No + 1) + " was replaced by zero.");
        System.out.println("Min element #" + (min_el_No + 1) + " was replaced by zero.");
        System.out.println("\nNew array:");
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + " ");
        }
    }

    private static void Task_4_7() {
        System.out.println("\n");
        System.out.println("Задание №4.7:");
        //int N = new Random().nextInt(25);
        int array[] = {1, 2, 8, 8, 3, 3, 5, 5, 5, 6, 1, 2};
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            //array[i] = new Random().nextInt(5);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nNew array:");
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[k] == array[j])
                    array[k] = 0;
            }
            System.out.print(array[j] + " ");
        }
    }

    private static void Task_4_8_a() {
        System.out.println("\n");
        System.out.println("Задание №4.8.a:");
        int N = new Random().nextInt(5) + 3;
        int array[] = new int[N];
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(500) - 250;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("\nNew array after deletion of negative values:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0)
                array[j] = 0;
            System.out.print(array[j] + " ");
        }
    }

    private static void Task_4_8_b() {
        System.out.println("\n");
        System.out.println("Задание №4.8.b:");
        int N = new Random().nextInt(5) + 3;
        int array[] = new int[N];
        Scanner scan = new Scanner(System.in);
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(500) - 250;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("\nPlease enter number which will be the limit for deletion of numbers beyond it:");
        int n = scan.nextInt();

        System.out.println("\nNew array after deletion of negative values:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] < n)
                array[j] = 0;
            System.out.print(array[j] + " ");
        }
    }

    private static void Task_4_8_c() {
        System.out.println("\n");
        System.out.println("Задание №4.8.c:");
        Scanner scan = new Scanner(System.in);
        int N = new Random().nextInt(5) + 5;
        int n1 = 0;
        int n2 = 0;
        int array[] = new int[N];
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1000) - 500;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("\nPlease enter the first item number: ");
        n1 = scan.nextInt();
        System.out.print("Please enter the second item number: ");
        n2 = scan.nextInt();
        System.out.println("\nRevised array:");
        for (int j = 0; j < array.length; j++) {
            if (j >= n1 & j <= n2)
                array[j] = 0;
            System.out.print(array[j] + " ");
        }
    }

    private static void Task_4_9_a() {
        System.out.println("\n");
        System.out.println("Задание №4.9.a:");
        int N = new Random().nextInt(5) + 3;
        int array[] = new int[N];
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(500) - 250;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("\nNew array after replacement of all even items from odd places with 777:");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0 & array[j] % 2 == 0)
                array[j] = 777;
            System.out.print(array[j] + " ");
        }
    }

    private static void Task_4_9_b() {
        System.out.println("\n");
        System.out.println("Задание №4.9.b:");
        int N = new Random().nextInt(10) + 3;
        int array[] = new int[N];
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1000) - 500;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("\nNew array (numbers shared integrally by 3 and 5 are replaced with 777:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0 | array[j] % 5 == 0)
                array[j] = 777;
            System.out.print(array[j] + " ");
        }
    }
}