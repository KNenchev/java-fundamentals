package _4_methods_exercise;

import java.util.Scanner;

public class _5_Add_and_Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        System.out.println(getSubtract(n1, n2, n3));
    }
    public static int getAdd(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
    public static int getSubtract(int n1, int n2, int n3){
        int sum = getAdd(n1 , n2) - n3;
        return sum;
    }
}
