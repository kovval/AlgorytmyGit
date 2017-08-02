package Algorithms;

import java.util.Random;

/**
 * Created by RENT on 2017-07-31.
 */
public class mRandom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "getRandom";
    }

    @Override

    public void runAlgorithm(String[] input) {
        Random mRandom = new Random();

        int[] tablosowe = new int[10];
        for(int i = 0; i < tablosowe.length; i++) {
            tablosowe[i] = mRandom.nextInt();
            System.out.printf(" %d", tablosowe[i]);
        }

        System.out.printf("\n\n");

        int[] tabParzyste = new int[10];
        for(int i = 0; i < tabParzyste.length; i++) {
            tabParzyste[i] = i*2;
            System.out.printf(" %d", tabParzyste[i]);
        }

        System.out.printf("\n\n");

        int[] tabnieparzyste = new int[10];
        for(int i = 0; i<tabnieparzyste.length; i++) {
            tabnieparzyste[i] = 2*i+1;
            System.out.printf(" %d", tabnieparzyste[i]);

        }

        System.out.printf("\n\n");

        int[] tabMaxMin = new int[input.length-1];

        for(int dlugoscTablicy = 1; dlugoscTablicy < tabMaxMin.length; dlugoscTablicy++) {
            tabMaxMin[dlugoscTablicy] = Integer.parseInt(input[dlugoscTablicy+1]);
        }
            int max = 0;
            int min = 0;

            for(int i = 0; i<tabMaxMin.length; i++ ) {
                if (max < tabMaxMin[i]) {
                    max = i;
                }
                if (min > tabMaxMin[i]) {
                    min = i;
                }
            }
        System.out.printf("Max indeks to:%d, a wartość to %d, a min indeks to: %d, a wartość to %d", max,tabMaxMin[max], min, tabMaxMin[min]);

        }

    }

