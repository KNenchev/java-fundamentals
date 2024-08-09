package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;
public class _4_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= rotation ; i++) {
            int first = arr[0];
            /*
            0  1  2  3 -> индекс
            32 21 61 1 -> елемент
            arr -> масива който ще копираме| srcPos: 1 -> от кой идекс започваме копирането т.е от 2рият елемнт в масива
            destPost: 0 -> първият копиран елемент ще бъде поставен на нулевия индекс| arr.length - 1 -> броят на елементите за копиране (дължината)
             */
            System.arraycopy(arr,1,arr,0,arr.length - 1);

            //Поставяме първият елемент в края на масива
            arr[arr.length - 1] = first;
        }
        for (int n : arr){
            System.out.print(n + " ");
        }
    }
}
