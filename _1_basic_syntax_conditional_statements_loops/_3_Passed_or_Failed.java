package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _3_Passed_or_Failed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade>= 3.00){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
