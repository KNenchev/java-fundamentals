package _4_methods_exercise;

import java.util.Scanner;

public class _10_Top_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //https://www.youtube.com/watch?v=ZY-yP8Epv8w&t=10185s
        int n = Integer.parseInt(sc.nextLine());

        isTop(n);
    }
    public static boolean isDivisible(int n){ // проверява дали сумата от цифрите се дели на 8
        int sum = 0; //сума от цифрите
        while (n > 0){
            sum += n % 10; // сумираме последна цифра
            n /= 10; //премахваме последната цифра
        }
        return sum % 8 == 0;  //сумата от цифрите на числото
    }

    public static boolean isOdd(int n ){
        while (n > 0){

            if ((n % 10) % 2 != 0){ // последна цифра + нечетна цифра -> поне една нечетна
                return true;
            }
            n /= 10; // премахваме последната цифра
        }
        return false;
    }
    public static void isTop(int n){
        //проверка дали е топ
        for (int i = 0; i < n; i++) {
            // сумата от цифрите да се дели на 8 + съдържа поне една нечетна цифра
            if (isDivisible(i) && isOdd(i)){
                System.out.println(i); // //топ число
            }
        }
    }
}
