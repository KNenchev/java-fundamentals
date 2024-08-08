package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _9_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        int days = 0;
        int total = 0;

        while (input >= 100) {

            total += input;
            total -= 26;

            input -= 10;
            days++;
        }

        int lastMeal = total - 26;

        if (lastMeal < 0) {
            lastMeal = 0;
        }
        System.out.println(days);
        System.out.println(lastMeal);
    }
}
