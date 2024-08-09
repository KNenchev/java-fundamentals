package _4_methods;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String order = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        priceForOrder(order, quantity);
    }

    private static void priceForOrder(String order, double quantity) {
        //     • "coffee" – 1.50
        //    • "water" – 1.00
        //    • "coke" – 1.40
        //    • "snacks" – 2.00
        if (order.equals("coffee")) {
            System.out.printf("%.2f", quantity * 1.5);
        } else if (order.equals("water")) {
            System.out.printf("%.2f", quantity);
        } else if (order.equals("coke")) {
            System.out.printf("%.2f", quantity * 1.4);
        } else if (order.equals("snacks")) {
            System.out.printf("%.2f", quantity * 2.0);
        }
    }
}
