package _2_datatypes_variables;

import java.util.Scanner;

public class _10_Special_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());



        for (int i = 1; i <= n ; i++) {

            int lastDigit = i;
            int sum = 0;

            while (lastDigit > 0){
                sum += lastDigit % 10;
                lastDigit = lastDigit / 10;
            }


            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True\n", i);
            }else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
