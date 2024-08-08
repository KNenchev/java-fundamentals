package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        int sum = numOfPeople / capacity;
        if (numOfPeople % capacity != 0){
            sum++;
        }

//        Друг подход е да се закръгли до най-близкото цяло число напр. 17/3 = 5,67 -> закръглява до 6.
//        int sum = (int) Math.ceil((double) numOfPeople / capacity);

        System.out.println(sum);
    }
}
