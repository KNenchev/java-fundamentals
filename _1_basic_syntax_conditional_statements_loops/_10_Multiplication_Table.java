package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _10_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, (n * i));
        }
    }
}
