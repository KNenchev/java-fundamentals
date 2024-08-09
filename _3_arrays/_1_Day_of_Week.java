package _3_arrays;

import java.util.Scanner;

public class _1_Day_of_Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(sc.nextLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (day >= 1 && day <= 7){
            System.out.println(daysOfWeek[day - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
