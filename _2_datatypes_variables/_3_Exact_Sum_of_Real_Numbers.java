package _2_datatypes_variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n =  Double.parseDouble(sc.nextLine());

        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 1; i <= n ; i++) {

            BigDecimal num = sc.nextBigDecimal();
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
