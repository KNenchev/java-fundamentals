package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();

        String reversedName = "";

        for (int i = userName.length() - 1; i >= 0 ; i--) {
            reversedName += userName.charAt(i);
        }

        int passwordCounter = 0;

        String password = sc.nextLine();
        while (!reversedName.equals(password)){

            passwordCounter++;
            if (passwordCounter == 4 ){
                System.out.printf("User %s blocked!", userName);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            password = sc.nextLine();
        }
        System.out.printf("User %s logged in.", userName);
    }
}
