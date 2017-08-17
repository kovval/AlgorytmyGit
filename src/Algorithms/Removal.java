package Algorithms;

import java.util.Random;

public class Removal extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "przeprowadzka";
    }

    @Override
    public void runAlgorithm(String[] input) {
        // pierwsza cyfra to pojemnosc bagazu kolejne cyfry to wagi bagazow ilosc bagazow wynika z podanych bagażów
        //np. 20 5 5 5 5 5 5 5 5 powinno dać 2
        int amount = input.length - 2;//podajemyliczbe bagażów na podstawie długości talbicy
        int capacitanceLuggage = Integer.parseInt(input[1]); // pojemność kartonu
        int[] luggage = new int[amount]; // tablice pakunków
        int counter = 0;    // zerujemy liczbe pakunków
        for (int i = 0; i < amount; i++) {
            luggage[i] = Integer.parseInt(input[i + 2]); // wypisujemy do tablice wagi bagazy
        }
        for (int i = 0; i < luggage.length; i++) {//do końca wszystkich bagażów
            int weighPrim = capacitanceLuggage;//ustawiamy nasz bagaż jako pusty (wolna przestrzeń do załadunku)

            for (int j = 0; luggage.length > j; j++) {//lecimy po wszystkich paunktach, aż nie skończymy ze wszystkimi bagażami

                if (weighPrim < capacitanceLuggage && weighPrim >= luggage[j]) {//ta pętla ma za zadanie wypełniać wolne
                    weighPrim = weighPrim - luggage[j];                           //pojemności do ładowania bagazu
                    luggage[j] = 0;
                }

                if (weighPrim >= luggage[j] && luggage[j] != 0) {// w tą pętle ląduje pakunek zawsze jako pierwszy
                    weighPrim = weighPrim - luggage[j];// i tylko tutaj
                    luggage[j] = 0;
                    counter++;
                }
                if (weighPrim == 0) { // gdybyśmy załadowali bagaż całkowicie
                    break;
                }
            }
        }
        System.out.println(counter + " Działą po dniu męki zrobione troszkę pewnie kodu niepotrzebnego się znajdzie, ale najważniejsze, że work");

    }
}
