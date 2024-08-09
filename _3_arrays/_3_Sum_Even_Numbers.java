package _3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _3_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for(int nums : numbers){
            if(nums % 2 == 0){
                sum += nums;
            }
        }
        System.out.println(sum);
    }
}
