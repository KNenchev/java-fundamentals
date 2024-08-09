package _4_methods;

import java.util.Scanner;

public class _4_Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        addCalculation(sc, command);
        multiplyCalculation(sc, command);
        subtractCalculation(sc, command);
        divideCalculation(sc, command);
    }

    private static void divideCalculation(Scanner sc, String command) {
        if (command.equals("divide")){
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());

            System.out.println(a / b);
        }
    }

    private static void subtractCalculation(Scanner sc, String command) {
        if (command.equals("subtract")){
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());

            System.out.println(a - b);
        }

    }

    private static void multiplyCalculation(Scanner sc, String command) {
        if (command.equals("multiply")){
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());

            System.out.println(a * b);
        }
    }

    private static void addCalculation(Scanner sc, String command) {
        if (command.equals("add")){
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(a + b);
        }
    }
}
