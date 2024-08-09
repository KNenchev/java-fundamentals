package _4_methods;

import java.util.Scanner;

public class _6_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        System.out.println(rectangleArea(width, length));
    }

    private static int rectangleArea(int x, int y) {
        return x * y ;
    }
}
