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

//        int maksimumTablicy = input.length -1;
        int n = input.length-2;
        int maksimumTablicy = Integer.parseInt(input[1])+1;
        int[] tabSparsowanych = new int[n];

//        int[] tab = new[n];
//        int [][] sortowanaTablica = new int[2][maksimumTablicy];

            for(int i=0; i<tabSparsowanych.length; i++) {
            tabSparsowanych[i] = Integer.parseInt(input[i+2]);
        }
            int[] tablicaDoZliczania = new int[maksimumTablicy];
            for (int i =0; i< tabSparsowanych.length; i++) {
                int liczba = tabSparsowanych[i];
                tablicaDoZliczania[liczba]++;
            }
            int[][] literowanaTablica = new int[2][maksimumTablicy];

            for (int indeksTablicy = 0; indeksTablicy < tablicaDoZliczania.length; indeksTablicy++){

                for(int ileLiczb = tablicaDoZliczania[indeksTablicy]; ileLiczb != 0; ileLiczb--) {

                    System.out.printf("%d ", indeksTablicy);
                }

            }
// Dorobic wypisywanie          1 2 3 4 5 6 7 8 9
// ponizej podać ilosc np       2 3 4 4 0 2 6 3 2

    }
}
