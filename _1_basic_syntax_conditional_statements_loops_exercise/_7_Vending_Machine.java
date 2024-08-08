package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _7_Vending_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        double sum = 0;

        while (!command.equals("Start")){

            double n = Double.parseDouble(command);

            if (n == 0.1 || n == 0.2 || n == 0.5 || n == 1 || n == 2){
                sum += n;
            }else {
                System.out.printf("Cannot accept %.2f\n", n);
            }

            command = sc.nextLine();
        }
        String buyCommand = sc.nextLine();
        while (!buyCommand.equals("End")){

            if (buyCommand.equals("Nuts")){ // it can happen if(buyCommand.equals("Nuts") && sum >= 2.0)
                if (sum >= 2.0){
                    System.out.printf("Purchased %s\n", buyCommand);
                    sum -= 2.0;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (buyCommand.equals("Water")){
                if (sum >= 0.7){
                    System.out.printf("Purchased %s\n", buyCommand);
                    sum -= 0.7;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (buyCommand.equals("Crisps")){
                if (sum >= 1.5){
                    System.out.printf("Purchased %s\n", buyCommand);
                    sum -= 1.5;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (buyCommand.equals("Soda")){
                if (sum >= 0.8){
                    System.out.printf("Purchased %s\n", buyCommand);
                    sum -= 0.8;
                }else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (buyCommand.equals("Coke")){
                if (sum >= 1.0){
                    System.out.printf("Purchased %s\n", buyCommand);
                    sum -= 1.0;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }

            buyCommand = sc.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
