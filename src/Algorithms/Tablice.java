package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class Tablice extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "gadomsko";
    }

    @Override
    public void runAlgorithm(String[] input) {
        //trzy tablice trzeba zrobic jedna ma przechowywac wszystkie dane
        // druga ma przepisac wszystkie dane z tej pierwszej
        //potem ta pierwsza ma ponumerowac swoje liczby, gdzie pierwsza bedzie najczesciej wystepujaca
        // nastepnie mamy talbice w, ktora posegreguje do kupy powtarzajace sie cyfry, a potem poda liczbe ich wystapien
        // [ 1 2 3 4 5 6 7 8 9]
        // [ 0 9 3 4 5 66 4 2 1] => tak powinna wygladac tablica w[]


        int[] tabT = new int[input.length-1];

        for (int i = 1; i < tabT.length; i++) {
            tabT[i] = Integer.parseInt(input[i+1]);
            }
                 int[] tabL = new int[tabT.length];
                for (int j = 1; j < tabT.length; j++) {
                    tabL[j] = tabT[j];
                 }
                   for(int k = 0; k < tabL.length; k++) {
                       for (int l = 0; l < tabL.length - 1; l++) {
                           if (tabT[l] >= tabT[l + 1]) {
                               int temp = tabT[l];
                               tabT[l] = tabT[l + 1];
                               tabT[l + 1] = temp;
                           }
                       }
                   }
                    int[][] tabW = new int[2][10];
                   for (int m = 0; m < 10; m++) {
                       tabW[0][m] = m;
                       for (int j = 0; j < tabT.length; j++) {
                           if (tabT[j] == m) {
                               tabW[1][m]++;
                           }
                       }
                   }

                    for (int m = 0; m < 10; m++) {
                        System.out.printf("%d  ", tabW[0][m]);
                    }
        System.out.println();
                      for (int m = 0; m < 10; m++) {
                          System.out.printf("%d  ", tabW[1][m]);
                     }
                    int wynik = 0;
                        for (int i = 0; i < 10; i++) {
                        if (tabW[1][i]>wynik){
                        wynik = tabW[0][i];
                    }
                        }

//        int innyWynik = 0;
//                for (int i = 0; i < tabL.length; i++) {
//                    if (tabL[i] > innyWynik){
//                        innyWynik = i;
//                    }
//                }

        System.out.printf("\nDominanta w tym wypadku to: %d", wynik);
//        System.out.printf("\nDominanta pozyskana w inny sposob to w tym wypadku to: %d", innyWynik);


    }
}
