package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _12_Refactor_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
