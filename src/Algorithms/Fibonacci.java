package Algorithms;

/**
 * Created by jake on 25.07.2017.
 */
public class Fibonacci extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Fibonacci";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Fib(n));
    }
    private int Fib(int n){
        if(n==0) //Jeżeli n wynosi 0 zwróć 0
            return 0;
        if(n==1) //Jeżeli n wynosi 1 zwróć 1
            return 1;

        return Fib(n-1) + Fib(n-2);  //Jeżeli n nie wynosi ani 0, ani 1 wylicz wartość dla
        // Fib(n-1) oraz Fib(n-2), a następnie zsumuj
    }
}
