package Algorithms;

/**
 * Created by RENT on 2017-08-04.
 */
public class ZmienneITablice extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "zmienne i talbice";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int[] tablica = new int[input.length-1];
        for(int i = 1; i < tablica.length ; i++) {
            tablica[i] = Integer.parseInt(input[i]);
        }


        for(int i = 0; i<tablica.length;i++) {
            for(int j = 0; j<i; j++) {
                if((tablica[i] == tablica[j])){
                    System.out.printf("wartosc z talbicy: %d powtarza się w indeksie %d i indeksie %d", tablica[i], i, j);
                    return;
                }
            }
            if(i+1==tablica.length){
                System.out.printf("tablica przeleciana i nic sie nie powtarza %d", i );
                return;
            }

        }

    }
}
