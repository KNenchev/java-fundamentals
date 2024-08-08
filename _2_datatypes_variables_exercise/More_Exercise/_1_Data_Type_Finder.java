package _2_datatypes_variables_exercise.More_Exercise;

import java.util.Scanner;

public class _1_Data_Type_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("END")) {
            Scanner type = new Scanner(input);

            if (type.hasNextInt()){
                System.out.printf("%s is integer type\n", input);
            } else if (type.hasNextDouble()) {
                System.out.printf("%s is floating point type\n", input);
            } else if (type.hasNextBoolean()) {
                System.out.printf("%s is boolean type\n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type\n", input);
            } else if (type.hasNextLine()) {
                System.out.printf("%s is string type\n", input);
            }
            input = sc.nextLine();
        }
    }
}
