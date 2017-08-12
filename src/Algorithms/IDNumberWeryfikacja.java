package Algorithms;

import com.sun.org.apache.xpath.internal.SourceTree;

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
        int ten = 10;
        String iD = input[1];
        char[] iDNumber = iD.toCharArray();

        for (int iDCharsCounter = 0; iDCharsCounter <= 2; iDCharsCounter++) {
            for(int i = 0; _letters.length > i; i++) {

            if(_letters[i] == (iDNumber[iDCharsCounter])) {
                veryficator[iDCharsCounter] = i;
            }
            }
            System.out.println(veryficator[0] + veryficator[1] + veryficator[2]);
        }








    }
}
