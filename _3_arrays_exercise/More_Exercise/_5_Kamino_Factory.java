package _3_arrays_exercise.More_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_Kamino_Factory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the length of DNA sequences
        int sequenceLength = Integer.parseInt(sc.nextLine());

        // Variables to store information about the best sequence
        String bestSequence = "";
        int bestSequenceIndex = 0;
        int bestSequenceSum = 0;
        int bestSubsequenceLength = 0;
        int bestSubsequenceStartIndex = 0;
        int currentIndex = 0;

        // Main loop to process input sequences
        while (true) {
            String input = sc.nextLine();
            // Check if we've reached the end of input
            if (input.equals("Clone them!")) {
                break;
            }

            currentIndex++; // Keep track of the current sequence number

            // Split the input by one or more '!' characters and join the parts
            String[] parts = input.split("!+");
            StringBuilder sequence = new StringBuilder();
            int sequenceSum = 0;
            int maxSubsequenceLength = 0;
            int maxSubsequenceStartIndex = 0;

            // Reconstruct the sequence without '!' characters
            for (String part : parts) {
                sequence.append(part);
            }

            // Analyze the current sequence
            for (int i = 0; i < sequenceLength; i++) {
                // Calculate the sum of all digits in the sequence
                sequenceSum += Character.getNumericValue(sequence.charAt(i));

                // Find the longest subsequence of ones starting from each position
                int subsequenceLength = 0;
                for (int j = i; j < sequenceLength; j++) {
                    if (sequence.charAt(j) == '1') {
                        subsequenceLength++;
                    } else {
                        break;
                    }
                }
                // Update the max subsequence length and start index if necessary
                if (subsequenceLength > maxSubsequenceLength) {
                    maxSubsequenceLength = subsequenceLength;
                    maxSubsequenceStartIndex = i;
                }
            }

            // Determine if the current sequence should become the new best sequence
            boolean shouldUpdate = false;
            if (maxSubsequenceLength > bestSubsequenceLength) {
                // Current sequence has a longer subsequence of ones
                shouldUpdate = true;
            } else if (maxSubsequenceLength == bestSubsequenceLength) {
                if (maxSubsequenceStartIndex < bestSubsequenceStartIndex) {
                    // Same length, but current sequence's subsequence starts earlier
                    shouldUpdate = true;
                } else if (maxSubsequenceStartIndex == bestSubsequenceStartIndex && sequenceSum > bestSequenceSum) {
                    // Same length and start index, but current sequence has a greater sum
                    shouldUpdate = true;
                }
            }

            // Update the best sequence if necessary
            if (shouldUpdate) {
                bestSequence = sequence.toString();
                bestSequenceIndex = currentIndex;
                bestSequenceSum = sequenceSum;
                bestSubsequenceLength = maxSubsequenceLength;
                bestSubsequenceStartIndex = maxSubsequenceStartIndex;
            }
        }

        // Print the results
        System.out.println("Best DNA sample " + bestSequenceIndex + " with sum: " + bestSequenceSum + ".");
        System.out.println(String.join(" ", bestSequence.split("")));
    }
}
