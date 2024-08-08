package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _9_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int currentNum = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(currentNum);
            sum += currentNum;
            currentNum += 2;
        }
        System.out.println("Sum: " + sum);
    }
}
