package seminar2.example;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов
//        c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Веберите задачу
                1. Вернуть строку длиной N, которая состоит из чередующихся симоволов.
                2. Создать файл с названием file.txt. Записать в него Слово "TEXT" 100 раз.
                3. Остановить программу
                -> """);
        int num = sc.nextInt();

        while (num != 3){
            switch (num){
                case 1:
                    System.out.print("Введите длину строки -> ");
                    int lenStr = sc.nextInt();
                    System.out.print("Введите символ -> ");
                    sc.nextLine();
                    String str = sc.nextLine();
                    System.out.print("Введите символ -> ");
                    String str1 = sc.nextLine();
                    System.out.println(alternatingVowels(lenStr, str, str1));
                case 2:
//                  File dir = new File("C:\\Users\\Василий\\IdeaProjects\\java\\src\\main\\java\\seminar2");
//                  dir.mkdir();
                    String text1 = Filetext100();
                    System.out.println(text1);
                    Path text = Paths.get("C:\\Users\\Василий\\IdeaProjects\\java\\src\\main\\java\\seminar2","mmm.txt");
                    try {
                        text.toFile();
                        Files.write(text, text1.getBytes(StandardCharsets.UTF_8));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }




            }
            System.out.print("""
                Веберите задачу
                1. Вернуть строку длиной N, которая состоит из чередующихся симоволов.
                2. Создать файл с названием file.txt. Записать в него Слово "TEXT" 100 раз.
                3. Остановить программу
                ->  """);
            num = sc.nextInt();
        }


//        Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз

    }

    public static String alternatingVowels(int n, String c1, String c2){
        String str = "";

        for (int i = 0; i < 100; i++){
            str += c1 + c2;
        }
        return str;
    }
    public static String Filetext100(){
        String str = "";
        for (int i = 0; i < 100; i++) {
            str += "TEXT\n";
        }
        return str;
    }
}
