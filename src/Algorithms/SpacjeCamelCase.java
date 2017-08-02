package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class SpacjeCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {

        for(int liczbaSlow = 1; liczbaSlow < input.length; liczbaSlow++) {
            String slowa = input[liczbaSlow];
            char[] literyWSlowie = slowa.toCharArray();
            for (int liczbaLitery = 0; liczbaLitery < literyWSlowie.length; liczbaLitery++) {
                if (liczbaLitery == 0 )
                {
                    System.out.print(Character.toString(literyWSlowie[liczbaLitery]).toUpperCase());

                } else {
                    System.out.print(Character.toString(literyWSlowie[liczbaLitery]).toLowerCase());
                }
            }

        }



    }
}
