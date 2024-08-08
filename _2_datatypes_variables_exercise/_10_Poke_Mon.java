package _2_datatypes_variables_exercise;

import java.util.Scanner;

public class _10_Poke_Mon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());

//      M - distance
//      N - poke power
//      Y - exhaustion factor
//      Your task is to start subtracting M(distance) from N(poke power)
//      until N(poke power)  becomes less than M(distance), i.e. the Poke Mon does not have enough power to reach the next target.

        int halfOfPower = (int) ( pokePower * 0.50);
        int pokeTargets = 0;

        while (pokePower >= distance) {

            pokePower -= distance;
            pokeTargets ++;

            if (pokePower == halfOfPower && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }

        }
        System.out.println(pokePower);
        System.out.println(pokeTargets);
    }
}
