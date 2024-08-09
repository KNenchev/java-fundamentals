package _3_arrays_exercise;

import java.util.Scanner;

public class _3_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        int[] arr1 = new int[count];
        int[] arr2 = new int[count];

        for (int i = 1; i <= count ; i++) {
            String[] input = sc.nextLine().split(" ");
            int firstNumber = Integer.parseInt(input[0]);
            int secondNumber = Integer.parseInt(input[1]);

            if (i % 2 != 0){
                arr1[i -1] = firstNumber;
                arr2[i -1] = secondNumber;
            }else {
                arr1[i -1] = secondNumber;
                arr2[i -1] = firstNumber;
            }
        }
        for (int n : arr1){
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n : arr2){
            System.out.print(n + " ");
        }
    }
}
