package _4_methods;

import java.util.Scanner;

public class _2_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade = Double.parseDouble(sc.nextLine());

        grades(grade);
    }

    private static void grades(double grade) {
        if (grade >=2.00 && grade <= 2.99){
            System.out.println("Fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade >= 3.50 && grade <= 4.49) {
            System.out.println("Good");
        } else if (grade >= 4.50 && grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade >= 5.5 && grade <= 6.0) {
            System.out.println("Excellent");
        }
    }
}
