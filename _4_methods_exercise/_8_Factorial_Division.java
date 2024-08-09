package _4_methods_exercise;

import java.util.Scanner;

public class _8_Factorial_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        long factorial1 = calculateFactorial(n1);
        long factorial2 = calculateFactorial(n2);

        double result = factorial1 * 1.0 / factorial2;

        System.out.printf("%.2f", result);
    }
    public static long calculateFactorial(int n){
        long factorial = 1; // ако е "0" при умонжаване винаги ще получим 0, затова 1
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
