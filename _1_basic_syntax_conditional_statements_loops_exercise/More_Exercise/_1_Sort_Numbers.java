package _1_basic_syntax_conditional_statements_loops_exercise.More_Exercise;

import java.util.Scanner;

public class _1_Sort_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        int max = Math.max(Math.max(n1, n2), n3);
        int min = Math.min(Math.min(n1, n2), n3);

        int middle = n1 + n2 + n3 - max - min;

        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);

    }
}
