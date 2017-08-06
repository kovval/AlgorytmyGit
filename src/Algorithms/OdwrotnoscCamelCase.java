package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class OdwrotnoscCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    private String _duzeLitery[] = {"A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "W", "V", "X",
            "Y", "Z"};
    private String _maleLitery[] = {"a", "b", "c", "d", "e", "f", "g", "h",
            "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "w", "v", "x",
            "y", "z"};

    @Override
    public void runAlgorithm(String[] input) {

        for (int liczbaSlow = 1; liczbaSlow < input.length; liczbaSlow++) {
            String slowa = input[liczbaSlow];
            char[] literyWSlowie = slowa.toCharArray();

            for (int i = 0; i < slowa.length(); i++) {
                for (int j = 0; j < _duzeLitery.length; j++) {
                    if (_duzeLitery[j].equals(String.valueOf(literyWSlowie[i]))) {
                        System.out.print(" " + Character.toString(literyWSlowie[i]).toUpperCase());
                    }
                    if (_maleLitery[j].equals(String.valueOf(literyWSlowie[i]))) {
                        System.out.print(Character.toString(literyWSlowie[i]));
                    }
                }
            }
        }
    }
}




