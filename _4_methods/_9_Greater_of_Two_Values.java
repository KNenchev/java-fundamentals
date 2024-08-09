package _4_methods;

import java.util.Scanner;

public class _9_Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();


        switch (input){
            case "string" -> System.out.println(getMax(input1, input2));
            case "int" -> System.out.println(getMax(Integer.parseInt(input1), Integer.parseInt(input2)));
            case "char" -> System.out.println(getMax(input1.charAt(0), input2.charAt(0)));
        }

    }
    public static String getMax(String a, String b){
        if (a.compareTo(b) >= 0){
            return a;
        }else {
            return b;
        }
    }
    public static int getMax(int x, int y){
       return Math.max(x, y);
    }
    public static char getMax(char a, char b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }
}
