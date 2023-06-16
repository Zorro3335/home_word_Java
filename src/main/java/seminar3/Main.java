package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
//    Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
//    Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
//    Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Веберите задачу
                1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
                2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
                3. Остановить программу
                ->""");
        int num = sc.nextInt();

        while (num != 3){
            switch (num){
                case 1:
                    ArrayList<Integer> array = new ArrayList<Integer>();
                    Random random = new Random();
                    int size = random.nextInt(10);
                    for (int i = 0; i < size; i++) {
                        int ran = random.nextInt(1000);
                        array.add(ran);
                    }
                    System.out.println(Arrays.toString(array.toArray()));
                    System.out.println(Arrays.toString(removeOddNumbers(array).toArray()));
                case 2:
                    ArrayList<String> text = new ArrayList<String>();
                    System.out.print("Введите размер массива -> ");
                    int sizeArray = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < sizeArray; i++) {
                        String msg = String.format("Введите %d элемент массива -> ", i + 1);

                        System.out.print(msg);
                        text.add(sc.nextLine());
                    }

                    System.out.println(Arrays.toString(text.toArray()));
                    System.out.println(Arrays.toString(removeNumbersInArray(text).toArray()));
            }
            System.out.print("""
                Веберите задачу
                1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
                2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
                3. Остановить программу
                ->""");
            num = sc.nextInt();
        }
    }

    public static ArrayList<Integer> removeOddNumbers(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0){
                array.remove(i);
            }
        }
        return array;
    }
    public static ArrayList<String> removeNumbersInArray(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            try {
                Integer.parseInt(array.get(i));
                array.remove(i);
            } catch (NumberFormatException e) {

            }
        }
        return array;
    }
}
