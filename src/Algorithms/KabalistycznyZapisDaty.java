package Algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KabalistycznyZapisDaty extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    private char _letters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'}; //Tablica literek, która prezentuje nasz alfabet
    private Integer _numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50,
            60, 70, 80, 90, 100, 200, 300, 400, 500}; // tablica odpowiadających im literom

    @Override
    public void runAlgorithm(String[] input) {
        HashMap<Character, Integer> dataZapis = new HashMap<>(); // wszystko tym razem spisujemy do mapy
        for (int i = 0; i < _letters.length; i++) {             // mamy lepszy dostęp do liter a także ich wartości niż przy robieniu dwóch 
            dataZapis.put(_letters[i], _numbers[i]);
        }
        int[] suma = new int[input.length - 1];

        for (int liczbaSlow = 1; liczbaSlow < input.length; liczbaSlow++) {

            String slowa = input[liczbaSlow];
<<<<<<< HEAD
            char[] literyWSlowie = slowa.toUpperCase().toCharArray();
            for (int i = 0; i < literyWSlowie.length; i++) {
                for (int j = 0; j < _letters.length; j++) {
                    if (literyWSlowie[i] == _letters[j]) {
                        suma[liczbaSlow - 1] += dataZapis.get(_letters[j]);
=======
            char[] literyWSlowie = slowa.toUpperCase().toCharArray();//podnosimy litery do góry i zamieniamy je na chary
            for(int i = 0; i< literyWSlowie.length; i++) {          // i tak nie udało się zrobić tej kombinacji bez wykorzystania dwóch pętli
                for(int j = 0; j < _letters.length ; j++) {         //for
                    if (literyWSlowie[i] == _letters[j]) {          //pierw bierzemy literę, a następnie skanujemy w poszukiwaniu jej odpowiednika
                        suma += dataZapis.get(_letters[j]);         //następnie sumujemy zapis
>>>>>>> cfc30101f705f63fdca565f8337d6b1a8743fe3b
                    }
                }
            }
        }

<<<<<<< HEAD
        for (int i = 0; i < suma.length; i++) {
            System.out.printf("%s",suma[i]);
        }
=======

        System.out.println(suma); // każde słowo będzie miała swoją oddielną wartość.






>>>>>>> cfc30101f705f63fdca565f8337d6b1a8743fe3b
    }
}
