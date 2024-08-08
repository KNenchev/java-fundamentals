package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _10_Padawan_Equipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double availableMoney = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightSaberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        double sabersTotal = Math.ceil(1.10 * students);
        int beltsTotal = students - students / 6;

        double totalSum = (lightSaberPrice * sabersTotal) + (robePrice * students) + (beltsTotal * beltPrice);

        if (availableMoney >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalSum - availableMoney);
        }
    }
}
