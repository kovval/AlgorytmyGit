package Algorithms;

import java.util.Random;

public class BojtockieSwietoTrojkota extends AbstractAlgorithm{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int numberOfChildren = Integer.parseInt(input[1]);
        double kredFormetrSquer = Double.parseDouble(input[2]);

        Random generatorOdcink = new Random();

        int zuzytaKreda = 0;
        for(int i=0;i<numberOfChildren;i++){
            int a = generatorOdcink.nextInt((200))+11;
            int b = generatorOdcink.nextInt((200))+11;
            int c = generatorOdcink.nextInt((200))+11;
            if(a + b > c || a + c > b || b+c>a) {
                //wzór Herona
                int p = (a+b+c)/2;
                int squer = (int) Math.sqrt(Math.abs(p*(p-a)*(p-b)*(p-c))); // troche sciema ale dziala jak p było większe od
                // którejs zmiennej to wychodiziło p < od niej wtedy rzutowało na 0, co też nie było prawdą
                // statystyki lubią liczby naaturalne a populacja prędzej uwierzy w tysiące niż zera :D
                zuzytaKreda =+ squer*(int)Math.ceil(kredFormetrSquer);


            } else {
                System.out.print("Cos poszlo nie tak maszyna jest spiepszona \n");
            }
        }
        System.out.printf("%d", zuzytaKreda);






    }

}
