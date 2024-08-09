package _4_methods;

import java.util.Scanner;

public class _1_Sign_of_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        integerValue(number);

    }
    public static void integerValue(int number) {
        if (number > 0){
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        }else {
            System.out.println("The number " + number + " is zero.");
        }
    }
}
