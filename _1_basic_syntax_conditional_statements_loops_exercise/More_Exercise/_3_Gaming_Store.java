package _1_basic_syntax_conditional_statements_loops_exercise.More_Exercise;

import java.util.Scanner;

public class _3_Gaming_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = Double.parseDouble(sc.nextLine());
        String command = sc.nextLine();

        double spend = 0;
        while (!command.equals("Game Time")){

            double temp = 0;
            if (command.equals("OutFall 4")){
                temp = 39.99;
                if (balance < temp ){
                    System.out.println("Too Expensive");
                }else {
                    spend+= temp;
                    balance -= temp;
                    System.out.println("Bought OutFall 4");
                }
            } else if (command.equals("CS: OG")) {
                temp = 15.99;
                if (balance < temp ){
                    System.out.println("Too Expensive");
                }else {
                    spend+= temp;
                    balance -= temp;
                    System.out.println("Bought CS: OG");
                }
            }else if (command.equals("Zplinter Zell")) {
                temp = 19.99;
                if (balance < temp ){
                    System.out.println("Too Expensive");
                }else {
                    spend+= temp;
                    balance -= temp;
                    System.out.println("Bought Zplinter Zell");
                }
            }else if (command.equals("Honored 2")) {
                temp = 59.99;
                if (balance < temp ){
                    System.out.println("Too Expensive");
                }else {
                    spend+= temp;
                    balance -= temp;
                    System.out.println("Bought Honored 2");
                }
            }else if (command.equals("RoverWatch")) {
                temp = 29.99;
                if (balance < temp ){
                    System.out.println("Too Expensive");
                }else {
                    spend+= temp;
                    balance -= temp;
                    System.out.println("Bought RoverWatch");
                }
            }else if (command.equals("RoverWatch Origins Edition")) {
                temp = 39.99;
                if (balance < temp ){
                    System.out.println("Too Expensive");
                }else {
                    spend+= temp;
                    balance -= temp;
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            }else{
                System.out.println("Not Found");
            }

            if (balance<= 0){
                System.out.println("Out of money!");
                return;
            }
            command = sc.nextLine();
        }
        System.out.printf("Total spent: $%.2f. ", spend);
        System.out.printf("Remaining: $%.2f", balance);
    }
}
