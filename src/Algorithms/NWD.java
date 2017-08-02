package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class NWD extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "NWD";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        System.out.printf("NWD dla n %d ", Nwd(n, k));


    }


    private int Nwd(int k, int n) {
        if (k == 0) return n;

        return Nwd(n % k, k);
    }
}
