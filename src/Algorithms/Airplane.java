package Algorithms;

public class Airplane extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "samolot";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int[] date = new int[input.length];
        for(int i = 1; i<date.length;i++) {
            date[i-1] = Integer.parseInt(input[i]);
        }
        int numberOfPleace = date[0]*date[1]+date[2]*date[3];
        System.out.println(numberOfPleace);

    }
}
