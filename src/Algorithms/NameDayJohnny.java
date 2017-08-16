package Algorithms;

public class NameDayJohnny extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int numberOfPipils = Integer.parseInt(input[1]);// cjuba pupils powinno być, ale korzystanie z języka angielskiego mam ograniczone
        int numberOfCandys = Integer.parseInt(input[2]);

        int candysForJohnny = numberOfCandys % numberOfPipils;// cała prawda o cukierkach dla Jasia.

        if(candysForJohnny > 0) {
            System.out.printf("TAK %d", candysForJohnny);
        } else if (candysForJohnny == 0) {
            System.out.print("NIE");
        }



    }
}
