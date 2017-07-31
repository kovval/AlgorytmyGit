package Algorithms;

/**
 * Created by Kovval on 2017-07-30.
 */
public class Obzartuchy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String runAlgorithm(String[] input) {

        int zaproszeni = Integer.parseInt(input[1]);
        int liczbaCiastekWPudelku = Integer.parseInt(input[2]);
        int doba = 24*60*60; //24 godziny 60 minut i 60 sekund , ma potrzeby zadania wiecej nie trzeba
        int[] obzartuch = new int[zaproszeni];
        double ciastkaNaDobe = 0;

        if(zaproszeni!=input.length-3){//-3 bo nazwa potem liczba obzartuchow no i ciastka w pudelku
            System.out.print("Za mało danych\n");

        }

        for (int i = 0; i < zaproszeni; i++) {
            obzartuch[i] = Integer.parseInt(input[i+3]);//+3 bo pierwsze dwa elementy zajmują liczba uczestników i ciastka w pudełku, a liczenie zaczyna sięod 0.
            ciastkaNaDobe = ciastkaNaDobe + doba/obzartuch[i];
        }

       double potrzebnePudelka = Math.ceil(ciastkaNaDobe/liczbaCiastekWPudelku);// zaokrąglamy w górę

        System.out.printf("Liczba potrzebnych pudełek z ciastkami to: %1.0f ", potrzebnePudelka);







        return null;
    }
}
