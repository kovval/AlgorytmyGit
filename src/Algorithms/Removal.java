package Algorithms;

import java.util.Random;

public class Removal extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "przeprowadzka";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int amount = input.length-2;//podajemyliczbe bagażów na podstawie długości talbicy
        int capacitanceLuggage = Integer.parseInt(input[1]); // pojemność kartonu
        int[] luggage = new int[amount]; // tablice pakunków
        int counter = 0;    // zerujemy liczbe pakunków
        for(int i = 0; i<amount;i++) { 
            luggage[i] = Integer.parseInt(input[i+2]); // wypisujemy do tablice wagi bagazy
        }
            int a = luggage.length; // wychodzi na to, że to jest niepotrzebne, no ale niech zostanie
              for(int i=0; i < a ; i++) {
                  int weighPrim = capacitanceLuggage;

                for(int j =0 ;luggage.length > j ;j++ ) {//lecimy po wszystkich paunktach, aż nie skończymy z załadunkiem

                    if(weighPrim < capacitanceLuggage && weighPrim >= luggage[j]) {//ta pętla ma za zadanie wypełniać wolne 
                        weighPrim = weighPrim-luggage[j];                           //pojemności do ładowania bagazu
                        luggage[j] = 0;
                    }

                    if(weighPrim >= luggage[j] && luggage[j] != 0) {// w tą pętle ląduje pakunek zawsze jako pierwszy
                        weighPrim = weighPrim-luggage[j];
                        luggage[j] = 0;
                        counter++;
                    }
                    if(weighPrim == 0) { // gdybyśmy załadowali bagaż całkowicie
                        break;
                    }
                }
              }
        System.out.println(counter+" Działą po dniu męki zrobione troszkę pewnie kodu niepotrzebnego się znajdzie, ale najważniejsze, że work");

    }
}
