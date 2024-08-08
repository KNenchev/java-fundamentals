package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _4_Print_and_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
            sum += i;
        }
//        System.out.println();
        System.out.println("\nSum: " + sum);
    }
}
