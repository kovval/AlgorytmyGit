package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "sortowanie przez zliczanie";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length - 2;
        int maksimumTablicy = Integer.parseInt(input[1]) + 1;
        int[] tabSparsowanych = new int[n];

        for (int i = 0; i < tabSparsowanych.length; i++) {
            tabSparsowanych[i] = Integer.parseInt(input[i + 2]);
        }
        int[] tablicaDoZliczania = new int[maksimumTablicy];
        for (int i = 0; i < tabSparsowanych.length; i++) {
            int liczba = tabSparsowanych[i];
            tablicaDoZliczania[liczba]++;
        }

        for (int indeksTablicy = 0; indeksTablicy < tablicaDoZliczania.length; indeksTablicy++) {

            for (int ileLiczb = tablicaDoZliczania[indeksTablicy]; ileLiczb != 0; ileLiczb--) {

                System.out.printf("%d ", indeksTablicy);
            }
        }
    }
}
