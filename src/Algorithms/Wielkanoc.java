package Algorithms;

/**
 * Created by Kovval on 2017-07-29.
 */
public class Wielkanoc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "wielkanoc";
    }

    @Override
    public void runAlgorithm(String[] input) {

        for (int j = 1; j < input.length; j++) {
            int rok = Integer.parseInt(input[j]);

            int a = rok % 19;
            int b = rok / 100;
            int c = rok % 100;
            int d = b / 4;
            int e = b % 4;
            int f = ((b + 8) / 25);
            int g = ((b - f + 1) / 3);
            int h = (19 * a + b - d - g + 15) % 30;
            int i = c / 4;
            int k = c % 4;
            int l = (32 + 2 * e + 2 * i - h - k) % 7;
            int m = (a + 11 * h + 22 * l) / 451;
            int p = (h + l - 7 * m + 114) % 31;

            if (((h + l - 7 * m + 114) / 31) == 4) {
                System.out.printf("\ndzień wielkanocy %d roku to: %d Kwietnia", rok, p + 1);
            } else {

                System.out.printf("\ndzień wielkanocy %d roku to: %d Marca ", rok, p + 1);
            }
        }
    }
}
