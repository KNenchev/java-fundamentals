package _4_methods;

import java.util.Scanner;

public class _10_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split("");


    }

    private static int multiplyEvenByOdd(int[] numbers) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= Math.abs(numbers.length -1) ; i++) {
            if (Math.abs(numbers[i]) % 2 == 0){
                even += numbers[i];
            }else{
                odd += numbers[i];
            }
        }
        return even * odd;
    }

}
