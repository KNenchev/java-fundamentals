package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _7_Water_Overflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        int totalLitters = 0;
        for (int i = 1; i <= input ; i++) {

            int quantities = Integer.parseInt(sc.nextLine());

            totalLitters += quantities;

            if (totalLitters > 255){
                System.out.println("Insufficient capacity!");
                totalLitters -= quantities;
            }

        }
        System.out.println(totalLitters);
    }
}
