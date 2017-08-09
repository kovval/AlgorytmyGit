package Day21;

/**
 * Created by RENT on 2017-08-09.
 */
public class Sito {
    // dwa konstruktory
    //1 ma być bezargumentowy

    private boolean tab[];

    public Sito() {
     this(10000);
    }
    public Sito(int n) {
     tab = new boolean[n];
    }


    public void generujSito() {

        for (int p = 2; p < tab.length; p++) {
            tab[p] = true;
        }

        for (int i = 2; i < tab.length; i++) {
            if (tab[i]) {
                for (int j = i + i; j < tab.length; j = j + i) {
                    tab[j] = false;
                }
            }
        }
    }

        public void drukujSito(){

            for(int i = 2; i<tab.length; i++) {
                if (tab[i]) {
                    System.out.printf(" %d ", i );
                }
            }

    }

    }







