package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nOfPeople = Integer.parseInt(sc.nextLine());
        String typeOfPeople = sc.nextLine();
        String dayOfWeek = sc.nextLine();

        double totalPrice = 0.0;

        if (dayOfWeek.equals("Friday")) {
            if (typeOfPeople.equals("Students")) {
                totalPrice = nOfPeople * 8.45;
                if (nOfPeople >= 30){
                    totalPrice = totalPrice * 0.85;
                }
            } else if (typeOfPeople.equals("Business")) {
                totalPrice = nOfPeople * 10.90;
                 if (nOfPeople >= 100 ){
                     totalPrice = (nOfPeople - 10) * 10.90;
                 }
            } else if (typeOfPeople.equals("Regular")) {
                totalPrice = nOfPeople * 15;
                if (nOfPeople >= 10 && nOfPeople <= 20){
                    totalPrice = totalPrice * 0.95;
                }
            }
        } else if (dayOfWeek.equals("Saturday")) {

            if (typeOfPeople.equals("Students")) {
                totalPrice = nOfPeople * 9.80;
                if (nOfPeople >= 30) {
                    totalPrice = totalPrice * 0.85;
                }
            } else if (typeOfPeople.equals("Business")) {
                totalPrice = nOfPeople * 15.60;
                if (nOfPeople >= 100 ){
                    totalPrice = (nOfPeople - 10) * 15.60;
                }
            } else if (typeOfPeople.equals("Regular")) {
                totalPrice = nOfPeople * 20;
                if (nOfPeople >= 10 && nOfPeople <= 20){
                    totalPrice = totalPrice * 0.95;
                }
            }
        } else if (dayOfWeek.equals("Sunday")) {

            if (typeOfPeople.equals("Students")) {
                totalPrice = nOfPeople * 10.46;
                if (nOfPeople >= 30) {
                    totalPrice = totalPrice * 0.85;
                }
            } else if (typeOfPeople.equals("Business")) {
                totalPrice = nOfPeople * 16;
                if (nOfPeople >= 100 ){
                    totalPrice = (nOfPeople - 10) * 16;
                }
            } else if (typeOfPeople.equals("Regular")) {
                totalPrice = nOfPeople * 22.5;
                if (nOfPeople >= 10 && nOfPeople <= 20){
                    totalPrice = totalPrice * 0.95;
                }
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
