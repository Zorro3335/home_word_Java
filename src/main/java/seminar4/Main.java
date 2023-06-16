package seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Object> list = new LinkedList<>();
        list.add("Empty");
        boolean isExit = false;
        while (!isExit) {
            String s = sc.nextLine();
            if (s.equals("exit")) {
                isExit = true;
            }
            else if (getValue(s).equals("print")){
                int num = getIndex(s);
                System.out.println(list.get(num));
            }
            else {
                createArrays(list, s);
            }
        }
    }

    public static void createArrays (LinkedList<Object> list, String s) {
        int num = getIndex(s);
        String string = getValue(s);
        for (int i = 0; i != num; i++) {
            if (list.size() - 1 < num){
                list.add("Empty");
            }
        }
        list.set(num, string);
    }

    public  static String getValue (String s){
        String[] temp = s.split("~");
        return temp[0];
    }

    public static Integer getIndex (String s){
        String[] temp = s.split("~");
        int num = 0;
        if (isNumber(temp[1])){
            num = Integer.parseInt(temp[1]);
        }
        return num;
    }
    public static boolean isNumber (String str){
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
