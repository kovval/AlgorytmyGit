package Algorithms;

public class Snow extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "snieg";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int c = Integer.parseInt(input[3]);
        int s = Integer.parseInt(input[4]);

        int primMax = c;
        int counter = 0;

    while(primMax <= s*100) {
        if(primMax%a == 0 && primMax%b==0) {
            counter++;
        }
        primMax += c;
    }
        System.out.printf("%d", counter);

    }
}
