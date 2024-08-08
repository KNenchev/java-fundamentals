package _2_datatypes_variables_exercise.More_Exercise;

import java.util.Scanner;

public class _2_From_Left_to_The_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n ; i++) {
            String left = sc.next();
            String right = sc.next();

            long n1 = Long.parseLong(left);
            long n2 = Long.parseLong(right);

            int sum = 0;
            long lastDigit;
            if (n1 > n2){
                lastDigit = n1;
            }else {
                lastDigit = n2;
            }
            while (lastDigit != 0){
                sum += lastDigit % 10;
                lastDigit /= 10;
            }
            System.out.println(Math.abs(sum));
        }
    }
}
