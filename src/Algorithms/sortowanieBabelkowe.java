package Algorithms;

/**
 * Created by RENT on 2017-07-26.
 */
public class sortowanieBabelkowe extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Porównywanie liczb";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] sortowanaTablica = new int[input.length - 1];

        for (int i = 0; i < sortowanaTablica.length; i++) {
            sortowanaTablica[i] = Integer.parseInt(input[i + 1]);
        }


        for (int i = 0; i < sortowanaTablica.length; i++) {

            for (int j = 0; j < sortowanaTablica.length - 1; j++) {
                if (sortowanaTablica[j] >= sortowanaTablica[j + 1]) {
                    //                        sortowanaTablica.(sortowanaTablica.charAt(j), sortowanaTablica.charAt(j-1));
                    int temp = sortowanaTablica[j]; // tutaj zapamiętuje wartość tablicy, ktora zostanie wykorzystana do podmiany
                    sortowanaTablica[j] = sortowanaTablica[j + 1];// podmienia wartość
                    sortowanaTablica[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < sortowanaTablica.length; i++) {
            System.out.printf("%d ", sortowanaTablica[i]);
        }

    }
}
