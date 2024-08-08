package _1_basic_syntax_conditional_statements_loops_exercise.More_Exercise;

import java.util.Scanner;

public class _4_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        
        String reversed = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);
    }
}
