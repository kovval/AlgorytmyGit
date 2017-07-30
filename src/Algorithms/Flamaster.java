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
                char character = word.charAt(i);//znak char na tablicy stringa
                shorWord.append(character);//metoda string builder dodaje character
                int count = 1; // zliczanie powtorzeń
                if (i == word.length() - 1) { // warunek kończący gdy będize tylko jeden znak
                    break;
                }
                while (character == word.charAt(i + 1)) { // warunek powtórzeń znaku
                    count++;
                    i++;
                    if (i == word.length() - 1) {
                        break; //warunek końca
                    }
                }
                if (count == 2) {//warunek kolejnych powtórzeń
                    shorWord.append(character); // dodanie chara
                } else if (count > 2) { // jeżeli więcej niż 2 dodtanie liczby powtórzeń
                    shorWord.append(count);
                }
                if(i==word.length()-2){//jeżeli przedostatni znak = i bez tego nie skończy
                    shorWord.append(word.charAt(i+1));
                }
            }
            System.out.printf("%s ", shorWord);

        }

return input.toString();

    }
    }

