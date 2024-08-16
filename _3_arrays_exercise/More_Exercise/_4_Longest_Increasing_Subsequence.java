package _3_arrays_exercise.More_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4_Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input line and split it into an array of strings
        String[] input = sc.nextLine().split(" ");

        // Convert the input strings to integers and store them in an array
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int n = input.length; // Length of the input array
        int[] len = new int[n]; // Array to store lengths of LIS ending at each index
        int[] prev = new int[n]; // Array to store previous index in the LIS for each element

        // Initialize len array to 1 (each element is a subsequence of length 1)
        // Initialize prev array to -1 (no previous element)
        for (int i = 0; i < n; i++) {
            len[i] = 1;
            prev[i] = -1;
        }

        // Compute lengths of LIS ending at each index
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // If numbers[j] is less than numbers[i] and including numbers[i] in the subsequence
                // ending at numbers[j] increases the length, update len[i] and prev[i]
                if (numbers[j] < numbers[i] && len[j] + 1 > len[i]){
                    len[i] = len[j] + 1;
                    prev[i] = j;
                }
            }
        }

        // Find the maximum length of LIS and the index where it ends
        int maxLength = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (len[i] > maxLength){
                maxLength = len[i];
                maxIndex = i;
            }
        }

        // Reconstruct the LIS by tracing back through the prev array
        List<Integer> lis = new ArrayList<>();
        for (int i = maxIndex; i != -1 ; i = prev[i]) {
            lis.add(0, numbers[i]); // Add elements to the beginning of the list
        }

        for(int num : lis){
            System.out.print(num + " ");
        }
    }
}
