package _1_basic_syntax_conditional_statements_loops_exercise.More_Exercise;

import java.util.Scanner;

public class _5_Messages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


        String massage = "";
        for (int i = 1; i <= n ; i++) {
            String currDigit = sc.nextLine();

            int digitLength = currDigit.length();
            char singleDigit = currDigit.charAt(0);
            int mainDigit = Character.getNumericValue(singleDigit);

            int offset = (mainDigit -2) * 3;

            if (mainDigit == 8 || mainDigit == 9){
                offset++;
            }

            int letterIndex = offset + digitLength - 1;
            int letterACII = letterIndex + 97;


            char letter = (char) letterACII;
            if (mainDigit == 0){
                letter = (char) (mainDigit + 32);
            }
            massage += letter;
        }

        System.out.println(massage);
    }
}
