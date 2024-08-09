package _4_methods_exercise;

import java.util.Scanner;

public class _6_Middle_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        getMiddleCharacter(input);
    }
    public static void getMiddleCharacter (String input){
        int length = input.length(); // //дължина = брой символи

        if (length % 2 != 0){ //нечетна дължина -> 1 среден символ
            int middleSymbol = length / 2; //позиция на средния символ при нечетна дължина
            System.out.println(input.charAt(middleSymbol));

        }else { // четна дължина -> 2 средни символа
            int middleSymbol1 = length / 2 -1 ; // позиция на първия среден символ
            int middleSymbol2 = length / 2; // позиция на втория среден символ
            System.out.print(input.charAt(middleSymbol1) +""+""+ input.charAt(middleSymbol2));
        }
    }
}
