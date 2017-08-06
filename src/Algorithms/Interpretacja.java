package Algorithms;

import sun.security.x509.SerialNumber;

import java.util.AbstractCollection;

/**
 * Created by RENT on 2017-07-28.
 */
public class Interpretacja extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {

        String odpKuby = input[1];
        String odpZenka = input[2];
        String odpBogdana = input[3];

        int sumaBogdana = 0;
        int sumaZenka = 0;

        if (odpBogdana.length() == odpZenka.length() && odpZenka.length() == odpKuby.length()) {
            for (int i = 0; i < odpKuby.length(); i++) {
                if (odpKuby.charAt(i) != odpBogdana.charAt(i)) {
                    sumaBogdana++;
                }
                if (odpZenka.charAt(i) != odpZenka.charAt(i)) {
                    sumaBogdana++;
                }
            }
            float odp = odpBogdana.length();
            double szansa = (((sumaBogdana + sumaZenka) / 2) / (double) odpBogdana.length());

            System.out.printf("szansa na to, że zdadzą wynosi:  %f", szansa);
        } else {
            System.out.print("\n liczba odpowiedzi nie jest równa");
        }
    }
}
