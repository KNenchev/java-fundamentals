package _3_arrays_exercise;

import java.util.Scanner;

public class _2_Common_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        String commonElements = "";

        for (int i = 0; i <= arr2.length - 1; i++) {
            String temp1 = arr2[i];
            for (int j = 0; j <= arr1.length - 1 ; j++) {
                String temp2 = arr1[j];
                if (temp1.equals(temp2)){
                    commonElements += temp1 + " ";
                }
            }
        }
        System.out.println(commonElements);
    }
}
