package _3_arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _9_Array_Modifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = sc.nextLine();

        while (!command.equals("end")) {
            if (command.contains("decrease")) {
                for (int i = 0; i <= nums.length -1 ; i++) {
                    nums[i]--;
                }
            } else if (command.contains("swap")) {
                // вземаме индексите който трябва да разменин
                int swapIndex1 = Integer.parseInt(command.split(" ")[1]);
                int swapIndex2 = Integer.parseInt(command.split(" ")[2]);

                // създаваме два инт-а който ще държат тези числа от масива, който искаме да разменим
                int firstN = nums[swapIndex1];
                int secondN = nums[swapIndex2];

                // разменяме ги
                nums[swapIndex1] = secondN;
                nums[swapIndex2] = firstN;

            } else if (command.contains("multiply")) {
                int multiplyIndex1 = Integer.parseInt(command.split(" ")[1]);
                int multiplyIndex2 = Integer.parseInt(command.split(" ")[2]);

                int result = nums[multiplyIndex1] * nums[multiplyIndex2];

                nums[multiplyIndex1] = result;
            }
            command = sc.nextLine();

        }
        for (int i = 0; i < nums.length ; i++) {
            int temp = nums[i];
            if(i != nums.length -1){
                System.out.print(temp + ", ");
            }else {
                System.out.print(temp   );
            }
        }

    }
}
