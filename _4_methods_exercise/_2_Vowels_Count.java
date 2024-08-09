package _4_methods_exercise;


import java.util.Scanner;

public class _2_Vowels_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("");

        getVowels(input);
    }

    private static void getVowels(String[] input) {
        //a, e, i, o, u
        int counter = 0;
        for (String vowel : input){
            if (vowel.equalsIgnoreCase("a") || vowel.equalsIgnoreCase("e")
                || vowel.equalsIgnoreCase("i") || vowel.equalsIgnoreCase("o")
                || vowel.equalsIgnoreCase("u")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
