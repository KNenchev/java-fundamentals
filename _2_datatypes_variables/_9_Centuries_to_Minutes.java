package _2_datatypes_variables;

import java.util.Scanner;

public class _9_Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int centuries = Integer.parseInt(sc.nextLine());

        double year = 100 * centuries;
        double days =  365.2422 * year; // according Tropical year
        double hours = 24 * days; // we have 24 hours in one day!
        double minutes = 60 * hours; // one hour is 60 minutes

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries, year, days, hours, minutes);


    }
}
