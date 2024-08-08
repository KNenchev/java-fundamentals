package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _5_Print_Part_Of_ASCII_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startIndex = Integer.parseInt(sc.nextLine());
        int endIndex = Integer.parseInt(sc.nextLine());

        for (int i = startIndex; i <= endIndex ; i++) {
            char symbol = (char) i;

            System.out.print(symbol + " ");
        }
    }
}
