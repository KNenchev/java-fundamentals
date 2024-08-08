package _2_datatypes_variables;

import java.util.Scanner;

public class _4_Town_Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String townName = sc.nextLine();
        int populationOfTown = Integer.parseInt(sc.nextLine());
        short area = Short.parseShort(sc.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", townName, populationOfTown, area);
    }
}
