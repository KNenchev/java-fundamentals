package _4_methods;

import java.util.Scanner;

public class _3_Printing_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        printTriangle(n);
    }
    public static void printLine(int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void printTriangle(int n) {
        for (int i = 1; i <= n ; i++) {
            printLine(1, i);
        }
        for (int i = n -1; i >= 1 ; i--) {
            printLine(1, i);
        }
    }
}
