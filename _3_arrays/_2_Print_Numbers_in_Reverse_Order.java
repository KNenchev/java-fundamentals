package _3_arrays;

import java.util.Scanner;

public class _2_Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lengthOfArray = Integer.parseInt(sc.nextLine());

        int[]reversNumbers = new int[lengthOfArray];

        for (int i = 0; i <= reversNumbers.length - 1 ; i++) {
            reversNumbers[i] = Integer.parseInt(sc.nextLine());
        }
        for (int j = reversNumbers.length - 1; j >= 0 ; j--) {
            System.out.print(reversNumbers[j] + " ");
        }
    }
}
