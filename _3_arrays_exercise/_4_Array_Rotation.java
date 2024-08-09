package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _4_Array_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < rotation; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
