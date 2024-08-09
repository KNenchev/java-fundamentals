package _4_methods_exercise;

import java.util.Scanner;

public class _3_Characters_in_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char start = sc.nextLine().charAt(0);
        char end = sc.nextLine().charAt(0);

        getCharactersInRange(start, end);

    }
    public static void getCharactersInRange(char start, char end){
        //започваме със символа, който е с по-малък аски код
        if (start < end){
            //започваме от start -> приключваме в end
            for (char i = (char) (start + 1); i < end ; i++) {
                System.out.print(i + " ");
            }
        }else {
            //започваме от end -> приключваме в start
            for (char i = (char) (end + 1); i < start ; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
