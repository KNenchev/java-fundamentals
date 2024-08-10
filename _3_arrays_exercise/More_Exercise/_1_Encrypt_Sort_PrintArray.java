package _3_arrays_exercise.More_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Encrypt_Sort_PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] sum = new int[n];
        for (int i = 0; i < n ; i++) {
            String currSequence = sc.nextLine();

            int finalSum = 0;
            for (int j = 0; j <= currSequence.length() -1 ; j++) {
                char temp = currSequence.charAt(j);

                if (Character.toString(temp).equals("a") || Character.toString(temp).equals("e") ||Character.toString(temp).equals("i") ||Character.toString(temp).equals("o") ||Character.toString(temp).equals("u")
                  ||Character.toString(temp).equals("A") || Character.toString(temp).equals("E") ||Character.toString(temp).equals("I") ||Character.toString(temp).equals("O") ||Character.toString(temp).equals("U")){
                    finalSum += temp * currSequence.length();
                }else {
                    finalSum += temp / currSequence.length();
                }
            }
            sum[i] = finalSum;
        }
        Arrays.sort(sum);
        for (var i : sum){
            System.out.println(i);
        }
    }
}
