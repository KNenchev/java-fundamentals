package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _1_Ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        String person = "";

        if (age < 3) {
            person = "baby";
        } else if (age < 14) {
            person = "child";
        } else if (age < 20) {
            person = "teenager";
        } else if (age < 66) {
            person = "adult";
        } else if (age >= 66) {
            person = "elder";
        }
        System.out.println(person);
    }
}
