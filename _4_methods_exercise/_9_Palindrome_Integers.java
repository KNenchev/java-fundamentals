package _4_methods_exercise;

import java.util.Scanner;

public class _9_Palindrome_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        getPalindrome(sc, input);
    }
    public static void getPalindrome(Scanner sc, String command){
        while (!command.equals("END")){

            String reversed = "";
            for (int i = command.length() -1; i >= 0 ; i--) {
                reversed = reversed + command.charAt(i);
            }
            if (reversed.equals(command)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            command = sc.nextLine();
        }
    }
}
