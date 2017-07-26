package Algorithms;

/**
 * Created by jake on 25.07.2017.
 */
public class SzyfrCezara extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Szyfr Cezara";
    }

    private String _letters[] = {"A", "B", "C", "D", "E", "F", "G", "H",
                        "I", "J", "K", "L", "M", "N", "O", "P",
                        "Q", "R", "S", "T", "U", "W", "V", "X",
                        "Y", "Z"}; //Tablica literek, która prezentuje nasz alfabet

    @Override
    public void runAlgorithm(String[] input) {
        for (int words = 1; words < input.length; words++) //Przechodzimy po wszystkich wyrazach
        {
            String word = input[words].toUpperCase(); //Wyraz piszemy z wielkiej litery i zapisujemy do zmiennej
            char lettersInWord[] = word.toCharArray(); //Zamieniamy wyraz na pojedyncze literki
            for (int letter = 0; letter < lettersInWord.length; letter++) //Przechodzimy po każdej literce
            {
                int position = getLetterPosition(Character.toString(lettersInWord[letter])); //Pobieramy pozycję literki
                //inaczej mówiąc pobieramy jej numerek w tablicy, czyli dla A = 0; B = 1; C = 2 itd.
                if(!(position < 0) ) //Upewniamy się, że udało się znaleźć symbol
                {
                    int move = (position + 3)%_letters.length; //do pozycji literki dodajemy 3 znaki
                    //aby upewnić się, że nie odwołamy się do literki, która nie istnieje korzystamy z operacji modulo
                    //symbol %, która sprawi, że gdy odwołamy się np do 26 literki (nie ma jej) to zwróci nam 2 literkę
                    System.out.printf("%s", _letters[move]); //drukujemy przesuniętą literkę. Możemy ją pobrać z tablicy literek
                }
                else{
                    System.out.println("Podany znak nie występuje w naszej tablicy znaków!");
                }
            }
            System.out.print(" "); //po każdym słowie drukujemy spacje
        }
    }

    private int getLetterPosition(String letter){
        for (int i=0; i < _letters.length; i++) //Przwechodzimy po wszystkich literkach w naszej tablicy _letters
            //Jest to taki nasz pseudo Alfabet
        {
            if(letter.equals(_letters[i])) //Sprawdzamy czy literka wystąpiła w naszym alfabecie
            {
                return i; //Jeżeli wystąpiła zwracamy jej pozycję - zauważ, że "i" jest iteratorem, który idzie po całej tablicy
                //i przy jego pomocy pobieramy wartość z tablicy letters do porównania, więc zwracając go zwracamy pozycje
            }
        }
        return -1; //Jeżeli nie udało się znaleźć symbolu, wówczas zwracamy liczbę ujemną
    }
}
