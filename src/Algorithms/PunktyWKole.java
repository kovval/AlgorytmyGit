package Algorithms;

public class PunktyWKole extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "punkty w kole na podstawie rozkminy wzoru Gaussa, polecam przeczytać jego biografie";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int promien = Integer.parseInt(input[1]);
        double sumaKwadratow = 0;
        for(int i = 1; i<=promien ; i++ ) {
            sumaKwadratow += Math.floor(Math.sqrt((Math.pow(promien, 2) - Math.pow(i,2))));
        }
        int punkty = 1+4*promien+4*(int)sumaKwadratow;
        System.out.printf("w kole zmieści się %d punktow", punkty);
    }
}
