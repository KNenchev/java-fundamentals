package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _11_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n % 2 != 0){
            System.out.println("Please write an even number.");

            n = Integer.parseInt(sc.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(n));
    }
}
