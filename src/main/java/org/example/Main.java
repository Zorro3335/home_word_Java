package org.example;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("""
                Выберите задачу -> 
                1. Проверить сумму, которая находится в пределах от 10 до 20
                2. Проверить, что число пололжительное
                3. Напечать строку несколько раз
                4. Проверка на високосность года
                5. Возвращает массив длины len, каждое значение которого равно начальному значению
                6. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0.
                7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
                8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
                и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
                9. Остановить программу
                """);
        System.out.println("Введите номер задачи -> ");
        int number = in.nextInt();
        while (number != 9) {

            switch (number) {

//              Проверить сумму, которая находится в пределах от 10 до 20
                case 1:
                    System.out.println("Введите 1 число -> ");
                    int a = in.nextInt();
                    System.out.println("Введите 2 число -> ");
                    int b = in.nextInt();
                    System.out.println(isSumBetween10And20(a, b));
                    break;

//              Проверить, что число пололжительное
                case 2:
                    System.out.println("Введите число -> ");
                    int x = in.nextInt();
                    System.out.println(isPositive(x));
                    break;

//              Напечать строку несколько раз
                case 3:
                    System.out.println("Введите число -> ");
                    int repeat = in.nextInt();
                    System.out.println("Введите строку -> ");
                    in.nextLine();
                    String str = in.nextLine();
                    printString(str, repeat);
                    break;

//              Проверка на високосность года
                case 4:
                    System.out.println("Введите год -> ");
                    int year = in.nextInt();
                    System.out.println(isLeapYear(year));
                    break;

//              Возвращает массив длины len, каждое значение которого равно начальному значению
                case 5:
                    System.out.println("Введите длину массива -> ");
                    int lenArray = in.nextInt();
                    System.out.println("Введите начальное значение -> ");
                    int initialValue = in.nextInt();
                    System.out.println(Arrays.toString(createArray(lenArray, initialValue)));
                    break;

//              Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0.
                case 6:
                    System.out.println("Введите длину массива -> ");
                    int lenArr = in.nextInt();
                    System.out.println(Arrays.toString((zeroAndOne(lenArr))));
                    break;

//              Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
                case 7:
                    System.out.println("Введите длину массива -> ");
                    int lenarr = in.nextInt();
                    System.out.println(Arrays.toString((multiplyBy6(lenarr))));

//              Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//              и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
                case 8:
                    System.out.println("Введите количество строк -> ");
                    int n = in.nextInt();
                    System.out.println("Введите количество столбцов -> ");
                    int m = in.nextInt();

                    int[][] arr = matrix(n, m);
                    for (int i = 0; i < n; i++) {
                        System.out.println(Arrays.toString(arr[i]));
                    }
                    break;
            }
            System.out.print("""
                    Выберите задачу -> 
                    1. Проверить сумму, которая находится в пределах от 10 до 20
                    2. Проверить, что число пололжительное
                    3. Напечать строку несколько раз
                    4. Проверка на високосность года
                    5. Возвращает массив длины len, каждое значение которого равно начальному значению
                    6. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0.
                    7. Задать массив числа пройти по нему циклом, и числа меньше 6 умножить на 2
                    8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
                    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
                    9. Остановить программу
                    """);
            System.out.println("Введите номер задачи -> ");
            number = in.nextInt();
        }
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        }
        return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    private static int[] zeroAndOne(int len) {
//     1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            Scanner in = new Scanner((System.in));
            int num = in.nextInt();
            if (num == 1 || num == 0) {
                arr[i] = num;
            } else {
                System.out.println("Вы ввели не 1 или 0");
                break;
            }
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    private static int[] multiplyBy6(int len) {
//      Задать массив числа пройти по нему циклом, и числа меньше 6 умножить на 2
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            Scanner in = new Scanner((System.in));
            int num = in.nextInt();
            arr[i] = num;
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] < 6) {
                arr[i] *= 6;
            }
        }
        return arr;
    }

    private static int[][] matrix(int n, int m) {
//      Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//      и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                array[i][m - 1 - i] = 1;
            }

        }
        return array;
    }
}