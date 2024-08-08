package _2_datatypes_variables_exercise.More_Exercise;

import java.util.Scanner;

public class _3_Floating_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());

        double epsilon = 0.000001;
        if (Math.abs(num1 - num2) < epsilon){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
