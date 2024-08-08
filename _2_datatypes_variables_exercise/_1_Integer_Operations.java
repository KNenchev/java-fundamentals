package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _1_Integer_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());
        int n4 = Integer.parseInt(sc.nextLine());

        int sum = (n1 + n2) / n3  * n4;

        System.out.println(sum);
    }
}
