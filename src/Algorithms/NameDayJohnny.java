package Algorithms;

public class NameDayJohnny extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int numberOfPipils = Integer.parseInt(input[1]);
        int numberOfCandys = Integer.parseInt(input[2]);

        int candysForJohnny = numberOfCandys % numberOfPipils;

        if(candysForJohnny > 0) {
            System.out.printf("TAK %d", candysForJohnny);
        } else if (candysForJohnny == 0) {
            System.out.print("NIE");
        }



    }
}
