package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _2_Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;

            n = n / 10;
        }
        System.out.println(sum);
    }
}
