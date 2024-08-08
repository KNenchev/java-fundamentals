package _2_datatypes_variables_exercise.More_Exercise;

import java.util.Scanner;

public class _5_Decrypting_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        String decrypt = "";
        for (int i = 1; i <= n; i++) {
            char symbol = sc.nextLine().charAt(0);
            int temp = symbol + key;
            symbol = (char) temp;
            decrypt += symbol;
        }
        System.out.println(decrypt);
    }
}
