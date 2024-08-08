package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _8_Beer_Kegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        double biggestKeg = 0;
        String bestModel = "";

        for (int i = 1; i <= input; i++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            double temp = Math.PI * Math.pow(radius, 2) * height;

            if (temp > biggestKeg) {
                biggestKeg = temp;
                bestModel = model;
            }
        }
        System.out.println(bestModel);
    }
}
