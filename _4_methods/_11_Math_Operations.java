package _4_methods;

import java.util.Scanner;

public class _11_Math_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int b = Integer.parseInt(sc.nextLine());

        System.out.printf("%.0f", Calculation(a, operator, b));

    }
    public static double Calculation (int a, String operator, int b){
        double sum = 0;
        switch (operator){
            case "+" -> sum = a + b;
            case "-" -> sum = a - b;
            case "*" -> sum = a * b;
            case "/" -> sum = a / b;
        }

        return  sum;
    }
}
