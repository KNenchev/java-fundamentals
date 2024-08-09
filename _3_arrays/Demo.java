package _3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Създаване на масив

//        for (int i = nums.length - 1; i >= 0; i--) { // обратен ред за принтиране
//            System.out.println(nums[i]);
//        }
//        for (int i = 0; i < nums.length ; i++) { // начин за принтиране на масиви
//            System.out.println(nums[i]);
//        }
//        for (int i = 0; i <= nums.length - 1 ; i++) { // друг начин за принтиране разликата е че "<=" и "-1"
//            System.out.println(nums[i]);
//        }
//        for(int num : nums){ // със for each цикъл
//            System.out.println(num);
//        }
        System.out.println(nums[3]); // принтира избран елемент от масива

        String[] string = new String[]{}; // създаване на празен масив
//        String[] string = new String[3]; // Задаваме масив с дължина 3 елемента;
//        string[0] = "Kaloyan"; // запълване на масива
//        string[1] = sc.nextLine(); // запълване на масива с скенер
//        string[2] = "Pesho";
//        for(String name : string){
//            System.out.print(name + " ");
//        }

//        int input = Integer.parseInt(sc.nextLine()); // друг начин за запълвне на масив
//        int[] arrayLength = new int[input];
//
//        for (int i = 0; i <= arrayLength.length -1; i++){
//            arrayLength[i] = Integer.parseInt(sc.nextLine());
//        }
//        System.out.println(Arrays.toString(arrayLength)); // принтираме като Стринг
//        System.out.println(Arrays.stream(arrayLength) // принтираме използваики steam
//                  .mapToObj(String::valueOf)
//                  .collect(Collectors.joining(" "))); // и добавяме как да бъдат разделени


            // Прочитане на масив от конзолата

//        double[] floatNumbers = Arrays.stream(sc.nextLine().split(" "))
//                                .mapToDouble(Double :: parseDouble).toArray();
//
//        for (double num : floatNumbers){
//            System.out.println(num);
//        }

        String[] collection = sc.nextLine().split(" ");
        Arrays.stream(collection).forEach(System.out :: println);
    }
}