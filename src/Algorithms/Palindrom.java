package Algorithms;

/**
 * Created by Kovval on 2017-07-27.
 */
public class Palindrom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "palindrom";
    }

    @Override
    public String runAlgorithm(String[] input) {
        int number = Integer.parseInt(input[1]);
        int sum = 0;
        int rememberNumber = number;
        int reps = 0;

        while (number > 0) {
            int reserve = number % 10;
            sum = (sum * 10) + reserve;
            number = number / 10;
        }
        if (rememberNumber == sum) {
            System.out.printf("%d jest palindromem", rememberNumber);
        } else {
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
                }

                        System.out.printf("%d jest palindromem po %d sumowaniu ", sum, reps);
                    }
        return null;
                }

    }

