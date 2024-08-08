package _2_datatypes_variables;

import java.util.Scanner;

public class _1_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double meters = Double.parseDouble(sc.nextLine()) / 1000;

        System.out.printf("%.2f", meters);
    }
}
