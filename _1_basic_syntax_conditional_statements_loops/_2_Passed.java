package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _2_Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = Double.parseDouble(sc.nextLine());

        if (input >= 3.00){
            System.out.println("Passed!");
        }
    }
}
