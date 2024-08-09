package _4_methods;

import java.util.Scanner;

public class _10_Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers = Integer.parseInt(sc.nextLine());
        System.out.println(getMultiplyEvenByOdds(numbers));

    }
    public static int getEvenNumbers(int numbers){
        int sumEven = 0;
        while (Math.abs(numbers) > 0){
            int lastDigit = numbers % 10;
            if (lastDigit % 2 == 0){
                sumEven += lastDigit;
            }
            numbers = numbers / 10;
        }
        return sumEven;
    }
    public static int getOddNumbers(int numbers){
        int sumOdd = 0;
        while (Math.abs(numbers) > 0) {
            int lastDigit = numbers % 10;
            if (lastDigit % 2 != 0) {
                sumOdd += lastDigit;
            }
            numbers = numbers / 10;
        }
        return sumOdd;
    }
    public static int getMultiplyEvenByOdds(int numbers){
        return getEvenNumbers(numbers) * getOddNumbers(numbers);
    }
}
