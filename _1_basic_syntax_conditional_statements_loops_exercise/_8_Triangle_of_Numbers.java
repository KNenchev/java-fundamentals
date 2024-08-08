package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _8_Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
