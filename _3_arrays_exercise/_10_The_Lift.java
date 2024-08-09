package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _10_The_Lift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(sc.nextLine());
        int[] currentStateOfLift = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= currentStateOfLift.length -1 ; i++) {

            while (currentStateOfLift[i] < 4){
                if (peopleWaiting == 0){
                    break;
                }
                currentStateOfLift[i] ++;
                peopleWaiting--;
            }
        }
        if (peopleWaiting == 0 && currentStateOfLift[currentStateOfLift.length - 1] < 4 ){
            System.out.println("The lift has empty spots!");
        } else if (peopleWaiting > 0 && currentStateOfLift[currentStateOfLift.length -1] == 4) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleWaiting);
        }
        for (int n : currentStateOfLift){
            System.out.print(n + " ");
        }
    }
}
