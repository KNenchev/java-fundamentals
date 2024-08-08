package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _1_Student_Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age  = Integer.parseInt(sc.nextLine());
        double averageGrade = Double.parseDouble(sc.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);
    }
}
