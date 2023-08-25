package pro.sky;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    /*
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        int [] arr = new int[10];

        for (int index = 0; index < arr.length; index++) {
           //arr[index] = index + 1;
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
           System.out.print(arr[index] + " ");
        }

        System.out.println(Arrays.toString(arr));
        */
        /*
        class Main {
        public static void main(String[] args) {
            int[] array = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив
            System.out.println(array);//пытаемся вывести наш массив на экран без метода toString - получаем 16-ричное число
            System.out.println(Arrays.toString(array));//печатаем массив "правильно"
            Arrays.sort(array, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
            System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
            int key = Arrays.binarySearch(array, 5); // ищем key - число 5 в отсортированном массиве.
            //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
            System.out.println(key);//распечатываем индекс искомого числа
            System.out.println(Arrays.binarySearch(array, 0));//а теперь попробуем найти число, которого в массиве нет,
            // и сразу же выведем результат на экран

            }
        }
        */

        //TASK 1 & 2
        System.out.println("Task 1 & 2");

        int[] array = new int[] {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }

        //TASK 3
        System.out.println("\nTask 3");

        int[] array3 = new int[] {1, 2, 3};
        for (int i = array3.length - 1 ; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double[] array4 = {1.57, 7.654, 9.986};
        for (int i = array4.length - 1; i >= 0; i--) {
            System.out.print(array4[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        //TASK 4
        System.out.println("\nTask 4");
        int[] array5 = new int[] {1, 2, 3};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 != 0) {
                array5[i]++;
            }
        }
        System.out.println(Arrays.toString(array5));

    }
}