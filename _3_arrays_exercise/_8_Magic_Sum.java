package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _8_Magic_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magicN = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= nums.length -1 ; i++) {
         int firstN = nums[i];
            for (int j = i + 1; j<= nums.length -1; j++) {
                int secondN = nums[j];
                if (firstN + secondN == magicN){
                    System.out.println(firstN + " " + secondN);
                }
            }
        }
    }
}
