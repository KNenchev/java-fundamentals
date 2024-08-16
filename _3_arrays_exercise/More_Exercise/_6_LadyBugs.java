package _3_arrays_exercise.More_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _6_LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fieldSize = Integer.parseInt(sc.nextLine());

        int[] field = new int[fieldSize];
        // indexes on which there is a ladybug
        int[] indexes = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (var i : indexes) {
            if (i >= 0 && i <= field.length - 1) {
                field[i] = 1;
            }
        }

        String command = "";
        while (!"end".equals(command = sc.nextLine())) {
            String[] parts = command.split(" ");
            int index = Integer.parseInt(parts[0]);
            String direction = parts[1];
            int flightLength = Integer.parseInt(parts[2]);

            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                field[index] = 0;

                if (direction.equals("right")) {
                    index += flightLength; // new position

                    // whether a new position is available and whether the ladybug is in the field
                    while (index <= field.length - 1 && field[index] == 1) {
                        index += flightLength;
                    }
                    // it hasn't taken off
                    if (index <= field.length - 1) {
                        field[index] = 1; // landing
                    }

                } else if (direction.equals("left")) {
                    index -= flightLength;

                    while (index >= 0 && field[index] == 1) {
                        index -= flightLength;
                    }

                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }
        }

        for (var i : field) System.out.print(i + " ");

    }
}
