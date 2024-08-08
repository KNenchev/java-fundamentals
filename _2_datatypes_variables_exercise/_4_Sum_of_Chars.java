package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _4_Sum_of_Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            char symbol = sc.next().charAt(0);

            sum += symbol;
        }
        System.out.println("The sum equals: " + sum);
    }
}
