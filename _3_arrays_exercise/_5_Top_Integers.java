package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_Top_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length -1){
                System.out.print(arr[i]);
                break;
            }
            int currentNum = arr[i];
            boolean isTop = true;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                int nextN = arr[j];
                if (currentNum <= nextN){
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNum + " ");
            }
        }
    }
}
