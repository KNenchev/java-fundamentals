package _4_methods_exercise;

import java.util.Scanner;

public class _4_Password_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        getPasswordValidator(password);
    }

    private static void getPasswordValidator(String input) {
        boolean flag = true;

        if (input.length() < 6 || input.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            flag = false;
        }

        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("Password must consist only of letters and digits");
                flag = false;
                break;
            }
        }

        int digitCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                digitCounter++;
            }
        }
        if (digitCounter < 2){
            System.out.println("Password must have at least 2 digits");
            flag = false;
        }
        if (flag){
            System.out.println("Password is valid");
        }
    }
}
