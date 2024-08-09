package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _7_Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = nums.length;

        while (n > 1){
         int[] temp = new int[n - 1];
         // for loop -> от първият елемент до предпоследният
            for (int i = 0; i < n -1; i++) {
                // на първата итерация събираме -> елемента на индекс[0] и елемента на индекс[1].
                // На втората елемента на индекс[1] и елемента на индекс[2] и т.н.
                // След това сумата от тези два съседни елемента се присвоява на съответния индекс i в масив(temp)
                temp[i] = nums[i] + nums[i + 1];
            }
            //Обновяваме масивът(nums) с елементите от масивът(temp) за следващата итерация
            nums = temp;
            // намаляме n с 1;
            n--;
        }
        System.out.println(nums[0]);
    }
}
