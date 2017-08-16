package Algorithms;

public class Przedszkolanka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int grupaPierwsza = Integer.parseInt(input[1]);
        int grupaDruga = Integer.parseInt(input[2]);
        int x = grupaPierwsza;
        int y = grupaDruga;
        while(grupaPierwsza != grupaDruga) { //NWD
            if( grupaPierwsza > grupaDruga) {
                grupaPierwsza -= grupaDruga;
            } else {
                grupaDruga -= grupaPierwsza;
            }
        }
        System.out.printf("potrzeba by przedszkolanka miała %d cukierasów", (x*y)/grupaPierwsza); /NWW
    }
}
