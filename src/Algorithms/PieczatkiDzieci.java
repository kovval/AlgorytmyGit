package Algorithms;

import com.sun.javafx.image.impl.IntArgb;

import java.util.Objects;

import static java.lang.Character.*;

public class PieczatkiDzieci extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        String cyfry = input[1];
        int iloscWybranych = Integer.parseInt(input[2]);
        int wybrane = Integer.parseInt(input[3]);

        int liczba = 0;
        int counterReps = 0;

        while (counterReps != iloscWybranych) {
            counterReps = 0;// za każdym razem zerujemy zliczanie
            liczba = Integer.parseInt(cyfry);
            liczba = liczba + 1;
            cyfry = Integer.toString(liczba);

            for (int numerAtChar = 0; numerAtChar < cyfry.length(); numerAtChar++) {
                if (Integer.parseInt(String.valueOf(cyfry.charAt(numerAtChar))) == wybrane) {//jakimś cuem udało mi sięwyciągnąć wartość znaku
                    // ze stringa bez tego trzeba by było kombinować dalej
                    counterReps++;
                }
            }
        }
        System.out.println(liczba);
    }


}
