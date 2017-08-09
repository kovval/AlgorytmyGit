package Algorithms;

/**
 * Created by RENT on 2017-08-09.
 */
public class NWW extends AbstractAlgorithm{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        int nWW = (n*k)/Nwd(n, k);

        System.out.printf("NWW dla n %d ", Nwd(n, k));
    }
    private int Nwd(int k, int n) {
        if (k == 0) return n;

        return Nwd(n % k, k);
    }

    }

