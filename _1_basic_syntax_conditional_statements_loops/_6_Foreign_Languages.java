package _1_basic_syntax_conditional_statements_loops;

import java.util.Scanner;

public class _6_Foreign_Languages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String country = sc.nextLine();

        if (country.equals("USA") || country.equals("England")){
            System.out.println("English");

        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) {
            System.out.println("Spanish");

        }else {
            System.out.println("unknown");
        }
    }
}
