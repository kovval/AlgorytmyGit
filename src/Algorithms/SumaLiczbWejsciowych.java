package Algorithms;


public class SumaLiczbWejsciowych extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Suma liczb wejściowych";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int suma = 0;
        for(int i = 1; i < input.length; i++){
            //Pętla wykonuje się od pierwszego elementu (element 0 to nazwa algorytmu)
            //i wykonuje się do końca tablicy, czyli będziemy sumować wszystkie elementy, które podaliśmy na wejściu
            suma = suma + Integer.parseInt(input[i]);
            //dodajemy i jednocześnie parsujemy (zamieniamy ze stringów na inty)
            // kolejne wartości z tablicy wejściowej
            System.out.println(suma);
        }
    }
}
