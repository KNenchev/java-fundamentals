package _3_arrays_exercise;

import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trainWagon = Integer.parseInt(sc.nextLine());

        int[] passengers = new int[trainWagon];

        int sum = 0;
        for (int i = 0; i <= trainWagon - 1; i++) {
            passengers[i] = Integer.parseInt(sc.nextLine());
            sum += passengers[i];
            System.out.print(passengers[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
