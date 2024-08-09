package _4_methods;

import java.util.Scanner;

public class _7_Repeat_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        int repeat = Integer.parseInt(sc.nextLine());

        System.out.print(getRepeat(string, repeat));

    }
    public static String getRepeat(String string, int n){
        String temp = "";
        for (int i = 1; i <= n ; i++) {
            temp += string;
        }
        return temp;
    }
}
