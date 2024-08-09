package _4_methods_exercise;

import java.util.Scanner;

public class _2_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toLowerCase();

        System.out.println(getVowels(input));

    }

    public static int getVowels(String input) {
        int count = 0;

        for (char symbol : input.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        return count;
    }
}
