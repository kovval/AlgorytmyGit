package Algorithms;

/**
 * Created by jake on 24.07.2017.
 */
public class SumowanieLiczbNaturalnych extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sumowanie liczb naturalnych";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]); // Pobierz ile kolejnych liczb naturalnych będziemy sumować
        int suma = 0;
        int i = 1;
        while(i <= n){//Pętla wykona się n razy (dla każdej liczby, którą będziemy chcieli zsumować)
            suma = suma + i; //do sumy dodajemy kolejną liczbę naturalną
            i++; //zwiększamy iterator i jednocześnie zwiększamy o 1 liczbę naturalną do kolejnego sumowania
        }
        System.out.println(suma);
    }
}
