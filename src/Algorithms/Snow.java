package Algorithms;

public class Snow extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "snieg";
    }
// więcej nad tym było myślenia niż pisania

    @Override
    public void runAlgorithm(String[] input) {
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int c = Integer.parseInt(input[3]);
        int s = Integer.parseInt(input[4]);

        int primMax = a;// można by kombinować z szukaniem maxa, a potem dostosowaniem dwóch pozostałych
                        // ale zadanie mówi jasno, że ostatni krok jest najdłuższy
        int counter = 0;
    while(primMax <= s*100) { // dopóki droga nie ostanie osiągnięta
        if(primMax%c == 0 && primMax%b==0) { // szukamy niezerowego zwrotu
            counter++;// za każdym razem liczymy, całkowite pokrycie
        }
        primMax += a;// stawiamy kolejny najdłużsyz krok
    }
        System.out.printf("%d", counter);

    }
}
