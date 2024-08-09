package _3_arrays_exercise;

import java.util.Scanner;

public class _2_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        for (String element1 : arr2) {
            boolean isCommon = false;

            for (String element2 : arr1) {
                if (element1.equals(element2)) {
                    isCommon = true;
                    break;
                }
            }
            if (isCommon){
                System.out.print(element1 + " ");
            }
        }
    }
}
