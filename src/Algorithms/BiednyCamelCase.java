package Algorithms;
/* Działanie programu:
Ponieważ komentarze w kodzie wybijają mnie z rytmu piszę działanie programu na samej górze:
Pierw ustawiamy licznik letters na 0będzie nam potrzebny do określenia, czy wypisać z dużej litery czy z małej
następnie nasz wrzucony  tekst skanujemy po jego dlugosci od 1 elementu (1 bo na 0 w tablicy jest nazwa programu)
tworzymy stringa o nazwie word, który będzie przechowywał słowo do przetworzenia. Działanie programu będzie przetwarzać słowo po słowie
teraz musimy przeskanowac całe słowo na Chary - znaki tak by można było przelecieć po tablicy charów. Skanując tablice charów po indeksach szukamy tych,
które w reszcie z dzielenia przez 2 dają 0 i powiększamy je (pierwszy znak ma indeks 0". W przeciwnym wypadku drukujemy zmniejszony znak
Po każdym przejściu zwiększamy licznik letters o 1, a między każdym Stringiem dajemy spacje by widoczny był odstęp słów
*/
public class BiednyCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int letters = 0;
        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++)
        {
            String word = input[wordsCounter];
            char[] lettersInWord = word.toCharArray();
            for (int lettersCounter = 0; lettersCounter < lettersInWord.length; lettersCounter++)
            {
                if (letters % 2 == 0)
                {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toUpperCase());
                } else
                {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toLowerCase());
                }
                letters++;
            }
            System.out.print(" ");
        }
    }
}
