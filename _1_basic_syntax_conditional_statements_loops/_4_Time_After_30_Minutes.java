package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _4_Time_After_30_Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentHours = Integer.parseInt(sc.nextLine());
        int currentMinutes = Integer.parseInt(sc.nextLine());

        int totalMin = currentHours * 60 + currentMinutes + 30;

        currentHours = totalMin / 60;
        currentMinutes = totalMin % 60;

        if (currentHours > 23){
            currentHours = 0;
        }

        System.out.printf("%d:%02d", currentHours, currentMinutes);

    }
}
