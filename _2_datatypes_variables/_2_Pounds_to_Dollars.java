package _2_datatypes_variables;

import java.util.Scanner;

public class _2_Pounds_to_Dollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pound = Double.parseDouble(sc.nextLine()) * 1.36;

        System.out.printf("%.3f", pound);
    }
}
