package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _6_Triples_of_Latin_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            char firstChar = (char) (i + 97);
            for (int j = 0; j < n; j++) {
                char secondChar = (char) (j + 97);
                for (int k = 0; k < n; k++) {
                    char thirdChar = (char) (k + 97);
                    System.out.printf("%c%c%c\n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
