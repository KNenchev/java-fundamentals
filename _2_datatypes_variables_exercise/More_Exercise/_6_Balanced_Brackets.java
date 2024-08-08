package _2_datatypes_variables_exercise.More_Exercise;

import java.util.Scanner;

public class _6_Balanced_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int openBracket = 0;
        int closeBracket = 0;
        boolean isBalanced = true;

        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();

            if (input.equals("(")) {
                openBracket++;
                if (openBracket - closeBracket >= 2) {
                    isBalanced = false;
                    break;
                }
            } else if (input.equals(")")) {
                closeBracket++;
                if (closeBracket > openBracket) {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (openBracket != closeBracket) {
            isBalanced = false;
        }
        if (!isBalanced) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
