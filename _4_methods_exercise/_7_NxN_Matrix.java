package _4_methods_exercise;

import java.util.Scanner;

public class _7_NxN_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        getMatrix(n);
    }
    public static void getMatrix(int n){
        for (int row = 1; row <= n ; row++) { // обхожда вс. редове
            for (int col = 1; col <= n ; col++) { // обхожда вс. колони
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
