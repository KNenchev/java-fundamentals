package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _6_Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int sum = 0;

        for (int i = 0; i <= n.length() - 1 ; i++) {

            int individualDigits = Integer.parseInt((n.charAt(i) + ""));

            int factorial = 1;
            for (int j = 2; j <= individualDigits ; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        int num = Integer.parseInt(n);

        if (num == sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
