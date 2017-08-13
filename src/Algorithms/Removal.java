package Algorithms;

import java.util.Random;

public class Removal extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "przeprowadzka";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int amount = input.length-2;
        int capacitanceLuggage = Integer.parseInt(input[1]);
        int[] luggage = new int[amount];
        int counter = 0;
        for(int i = 0; i<amount;i++) {
            luggage[i] = Integer.parseInt(input[i+2]);
        }
            int a = luggage.length;
              for(int i=0; i < a ; i++) {
                  int weighPrim = capacitanceLuggage;

                for(int j =0 ;luggage.length > j ;j++ ) {

                    if(weighPrim < capacitanceLuggage && weighPrim >= luggage[j]) {
                        weighPrim = weighPrim-luggage[j];
                        luggage[j] = 0;

                    }
                    if(weighPrim >= luggage[j] && luggage[j] != 0) {
                        weighPrim = weighPrim-luggage[j];
                        luggage[j] = 0;
                        counter++;
                    }
                    if(weighPrim == 0) {
                        break;
                    }
                }
              }

        System.out.println(counter+" Teraz chyba działa, jako poprawke trzeba dac pierwsza cyfre zmieniona z dlugoscią tablicy");

    }
}
