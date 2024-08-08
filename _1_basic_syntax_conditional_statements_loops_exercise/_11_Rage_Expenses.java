package _1_basic_syntax_conditional_statements_loops_exercise;

import java.util.Scanner;

public class _11_Rage_Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGames = Integer.parseInt(sc.nextLine());
        double headSetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int trashedHeadsets = 0;
        int trashedMouse = 0;
        int trashedKeyboard = 0;
        int trashedDisplay = 0;

        for (int i = 1; i <= lostGames ; i++) {

            if (i % 2 == 0){
                trashedHeadsets++;
            }
            if (i % 3 == 0){
                trashedMouse++;
            }
            if (i % 6 == 0){
                trashedKeyboard++;
            }
            if (i % 12 == 0){
                trashedDisplay++;
            }
        }
        double totalPrice = (trashedHeadsets * headSetPrice) + (trashedMouse * mousePrice) +
                            (trashedKeyboard * keyboardPrice) + (trashedDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
