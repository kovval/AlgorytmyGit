package Algorithms;

public class Silnia extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Liczenie silni";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Silnia(n));
    }

    private int Silnia(int n){
        if(n < 2) //Jeżeli n wynosi 1 zwróć 1
            return 1;

        return n * Silnia(n-1); //W p.p. pomnóż n przez wartość wyliczoną rekurencyjnie przez silnie
    }
}
