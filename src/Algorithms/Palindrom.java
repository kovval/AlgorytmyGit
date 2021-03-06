package Algorithms;

import java.io.IOException;

/**
 * Created by Kovval on 2017-07-27.
 */
public class Palindrom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "palindrom";
    }

    @Override
    public void runAlgorithm(String[] input) {

        for (int i = 1; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            int sum = 0;
            int rememberNumber = number;
            int mark = number;
            int reps = 0;

            while (rememberNumber != sum) {
                rememberNumber = sum + rememberNumber;
                sum = 0;
                number = rememberNumber;
                reps++;
                while (number > 0) {
                    int reserve = number % 10;
                    sum = (sum * 10) + reserve;
                    number = number / 10;

                }
                if (reps > 10000) break;
            }
            if (reps == 1) {
                System.out.printf("\n%d jest palindromem bez sumowanie jej odwrotności", sum);
            } else if (reps < 30) {
                System.out.printf("\n%d jest palindromem po %d sumowaniu odwrotności w postaci liczby: %d ", mark, reps - 1, sum);
            } else System.out.println("Ta liczba nigdy nie będzie palindromem");
        }
    }
}





