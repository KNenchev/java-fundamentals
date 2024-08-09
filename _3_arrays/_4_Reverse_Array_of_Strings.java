package _3_arrays;

import java.util.Scanner;

public class _4_Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i < input.length / 2 ; i++) {

            String temp = input[i];
            input[i] = input[(input.length - 1) - i];
            input[(input.length - 1) - i] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}
