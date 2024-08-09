package _4_methods;

import java.util.Scanner;

public class _8_Math_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = Integer.parseInt(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        System.out.printf("%.0f", getMathPower(number, power));
    }

    private static double getMathPower(double number, int power) {
        return Math.pow(number, power);
    }
}
