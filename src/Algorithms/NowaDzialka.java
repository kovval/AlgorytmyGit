package Algorithms;

/**
 * Created by Kovval on 2017-07-30.
 */
public class NowaDzialka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {

        double[] poleDzialki = new double[input.length];
        for (int i=1; i< input.length;i++){
            int dlugoscDzialki = Integer.parseInt(input[i]);
            poleDzialki[i]=dlugoscDzialki*dlugoscDzialki;
        }

        for(int j=0; j<input.length-1;j++) {
            System.out.printf("\nPole dzialki wyznaczone przez jasia to: %2.2f", poleDzialki[j]);// Można by wcisnac zmienna odnosząca się do wieku, wiek odnosiłby się do wzrostu,
            // a wzrost przybliżał by do pełnego określenia ile taka na prawde zajmuje metrów jeden krok jasia.
            // no ale, tak zadanie można wyznaczyć szybciej... zajme siętym jak skończe inne zadanka
        }


    }
}
