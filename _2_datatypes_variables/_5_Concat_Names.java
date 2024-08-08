package _2_datatypes_variables;

import java.util.Scanner;

public class _5_Concat_Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String delimiter = sc.nextLine();

        System.out.printf("%s%s%s", name1, delimiter, name2);
    }
}
