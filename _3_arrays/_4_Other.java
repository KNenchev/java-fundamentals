package _3_arrays;

import java.util.Scanner;

public class _4_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        String[] reversed = new String[input.length];

        for (int i = 0; i <= input.length - 1 ; i++) {
            reversed[i] = input[input.length - 1 - i];
        }
        System.out.println(String.join(" ", reversed));
    }
}
