package _3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _6_Equal_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int identicalSum = 0;
        if (Arrays.equals(nums1, nums2)) {
            for (int num : nums1) {
                identicalSum += num;
            }
            System.out.println("Arrays are identical. Sum: " + identicalSum);
        } else {
            for (int i = 0; i <= nums1.length - 1; i++) {
                if (nums1[i] != nums2[i]) {
                    System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                    return;
                }
            }
        }
    }
}
