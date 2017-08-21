package SitoErastotelesa;

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
     tab = new boolean[n];//albo podana długość w n albo domyślne 10000
    }


    public void generujSito() {

        for (int p = 2; p < tab.length; p++) {//1 nie jest liczbą pierwszą dopiero 2 
            tab[p] = true;                      // ustawiamy wszystkie elementy w tablicy na true
        }

        for (int i = 2; i < tab.length; i++) {      // po całej dlugości tablicy zaczynamy skreślać (zmieniać na false, elementy
            if (tab[i]) {                           //ni będące liczbą pierwszą
                for (int j = i + i; j < tab.length; j = j + i) {//warunek jeżeli tab od i jest true
                    tab[j] = false;                             //to jego wielokrotność już nie,
                }                                               // w ten sposób idizemy do końaca tablicy
            }                                                   // metoda ta często będzie ustawiać ten sam element jako false
        }                                                       //jednak jest dzięki temu bardziej czytelna
    }

        public void drukujSito(){

            for(int i = 2; i<tab.length; i++) {// drukujemy sito
                if (tab[i]) {
                    System.out.printf(" %d ", i );
                }
            }

    }

    }







