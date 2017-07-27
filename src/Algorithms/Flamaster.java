package Algorithms;

/**
 * Created by Kovval on 2017-07-27.
 */
public class Flamaster extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "flamaster";
    }

    @Override
    public String runAlgorithm(String[] input) {

        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++) {
            String word = input[wordsCounter];
StringBuilder shorWord = new StringBuilder();

            for (int i = 0; i < word.length() - 1; i++) {//pętla [0]...[n-1] po długosci slowa
                char c = word.charAt(i);//znak char na tablicy stringa
                shorWord.append(c);//metoda string builder dodaje c
                int count = 1; // zliczanie powtorzeń
                if (i == word.length() - 1) { // warunek kończący
                    break;
                }
                while (c == word.charAt(i + 1)) { // warunek powtórzeń znaku
                    count++;
                    i++;
                    if (i == word.length() - 1) {
                        break; //warunek końca
                    }
                }
                if (count == 2) {//warunek kolejnych powtórzeń
                    shorWord.append(c); // dodanie chara
                } else if (count > 2) { // jeżeli więcej niż 2 dodanie liczby powtórzeń
                    shorWord.append(count);
                }
                if(i==word.length()-2){//jeżeli przedostatni znak = i
                    shorWord.append(word.charAt(i+1));
                }
            }
            return shorWord.toString();
        }

        return null;
    }
    }

