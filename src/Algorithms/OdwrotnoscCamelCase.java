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

    @Override
    public String runAlgorithm(String[] input) {

        for (int liczbaSlow = 1; liczbaSlow < input.length; liczbaSlow++) {
            String slowa = input[liczbaSlow];
            char[] literyWSlowie = slowa.toCharArray();
//            for (int liczbaLitery = 0; liczbaLitery < literyWSlowie.length; liczbaLitery++) {
//                if (literyWSlowieduzeLitery. )
//                {
//
//
//                } else {
//                    System.out.print(Character.toString(literyWSlowie[liczbaLitery]));
////                }
            for (int i = 0; i < _duzeLitery.length; i++) {
                for (int j = 0; j < slowa.length(); j++) {
                    if (_duzeLitery[i].equals(String.valueOf(literyWSlowie[j]))) {
                        System.out.print(" " + Character.toString(literyWSlowie[j]).toUpperCase());
                    }
//                    for (int k=1 ; k < liczbaSlow; k++) {
//                        System.out.print(" " + Character.toString(literyWSlowie[j]).toUpperCase());
//                    }

                }
            }

        }

        return null;
    }
}
