package _3_arrays_exercise.More_Exercise;

import java.util.Scanner;

public class _3_Recursive_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int res = 1;
        int first = 1, second = 1;

        if(n == 1 || n == 2){
            res = 1;

        }else {
            for (int i = 3; i <= n ; i++) {

                res = first + second;
                second = first;
                first = res;
            }
        }
        System.out.println(res);
    }
}
