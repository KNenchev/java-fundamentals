package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _6_Equal_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumRight = 0;
        for (int n : arr) {
            sumRight += n;
        }

        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            sumRight -= arr[i];
            if(sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
            sumLeft += arr[i];
        }

        System.out.println("no");
    }
}
