package _2_datatypes_variables;

import java.util.Scanner;

public class _8_Lower_or_Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
