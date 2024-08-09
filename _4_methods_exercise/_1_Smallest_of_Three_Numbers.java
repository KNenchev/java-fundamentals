package _4_methods_exercise;

import java.util.Scanner;

public class _1_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        getSmallestNumber(n1, n2, n3);
    }

    public static void getSmallestNumber(int n1, int n2, int n3) {
        System.out.println(Math.min(Math.min(n1, n2), n3));
    }
}
