package Algorithms;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.CharacterIterator;

public class IDNumberWeryfikacja extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "weryfikacja ID";
    }
    private char _letters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U','V', 'W', 'X',
            'Y', 'Z'}; //Tablica literek, która prezentuje nasz alfabet

    @Override
    public void runAlgorithm(String[] input) {
        int [] weigth = {7, 3, 1, 9, 7, 3, 1, 7, 3}; // tablica wag
        int [] veryficator = new int[9];
        String iD = input[1];
        char[] iDNumber = iD.toCharArray();
        int test = 0;

        for (int iDCharsCounter = 0; iDCharsCounter < 9; iDCharsCounter++) {
            for(int i = 0; _letters.length > i; i++) {
            if(_letters[i] == iDNumber[iDCharsCounter] && iDCharsCounter<3) {
                veryficator[iDCharsCounter] = i+10;
            } if(iDCharsCounter >= 3){
                    veryficator[iDCharsCounter] = Character.getNumericValue(iDNumber[iDCharsCounter]);
            }
            }
        }
            for(int i = 0; i < veryficator.length; i++) {
                veryficator[i] = veryficator[i]*weigth[i];
                test += veryficator[i];
            }
            if(test % 10 == 0) {
                System.out.print("Weryfikacja numeru dowodu osobistego przebiegła pomyślnie!");
            } else {
                System.out.println("Mamy nielegalnego imigranta, wyślijmy go do berlina ");
            }

    }
}
