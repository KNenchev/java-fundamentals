package _3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _5_Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int even = 0;
        int odd = 0;

        for (int num : number){
            if (num % 2 == 0){
                even+= num;
            }else {
                odd += num;
            }
        }
        System.out.println(even - odd);
    }
}
