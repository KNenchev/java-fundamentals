package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orders = Integer.parseInt(sc.nextLine());

        double sum = 0;
        for (int i = 1; i <= orders ; i++) {

            double pricePeerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            double capsule = Double.parseDouble(sc.nextLine());

            double singleOrderSum = (days * capsule) * pricePeerCapsule;
            sum += singleOrderSum ;

            System.out.printf("The price for the coffee is: $%.2f\n", singleOrderSum);
        }
        System.out.printf("Total: $%.2f", sum);
    }
}
