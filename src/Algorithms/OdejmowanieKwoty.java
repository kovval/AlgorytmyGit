package Algorithms;

public class OdejmowanieKwoty extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Odejmowanie kwoty";
    }

    @Override
    public void runAlgorithm(String[] input) {     //Użycie: odejmowaniekwoty 1757 45

        int amountZloty = Integer.parseInt(input[1]); //Wejściowa kwota złotych zamieniona na inta
        int amountGroszy = Integer.parseInt(input[2]); //Wejściowa kwota groszy zamieniona na inta

        int[] denominationsOfZloty = new int[]{200, 100, 50, 20, 10, 5, 2, 1}; //Tablica z nominałami złotówek od największych do najmniejszych
        int[] denominationsOfGrosze = new int[]{50, 20, 10, 5, 2, 1}; //Tablica z nominałami groszy od największych do najmniejszych

        //Ilość wydanych złotych i groszy
        int[] numberOfZloty = new int[8]; //Domyślnie świeżo utworzona tablica jest wyzerowana {0, 0 ... 0}
        int[] numberOfGroszy = new int[6];

        //W celu uproszczenia oddzielnie będziemy rozważać złotówki i grosze
        //Najpierw złotówki
        while (amountZloty > 0) { //Dopóki można wydać jakieś pieniądze
            for (int i = 0; i < numberOfZloty.length; i++) { // FOR Przechodzi po wszystkich nominałach w tablicy denominationsOfZloty
                if (amountZloty >= denominationsOfZloty[i]) { //Jeżeli jesteś w stanie wydać kwotę tym nominałem
                    amountZloty = amountZloty - denominationsOfZloty[i]; //Odejmij od ogólnej kwoty złotówek właśnie wskazany w tablicy nominał
                    numberOfZloty[i]++; //Zwiększ ilość banknotów lub monet, które wydaliśmy o konkretnym nominale
                    //Zauważ, że nominałowi w tablicy denominationsOfZloty na pozycji "i" odpowiada ilość wydanych monet/banknotów w numberOfZloty
                    break; //Przerywamy działanie pętli for, ponieważ udało nam się wydać pojedynczy nominał. Wracamy do whila
                }
            }
        }

        //Aby wydrukować konkretne wartości trzeba przejść przez pętle, która pozwoli na odczyt
        //ilości monet/banknotów, które wydaliśmy
        for (int i = 0; i < denominationsOfZloty.length; i++) {
            if(numberOfZloty[i] > 0)//Dla czytelności wydrukuj tylko te nominały, które wykorzystaliśmy
                System.out.printf("%d x %d zł\n", numberOfZloty[i], denominationsOfZloty[i]);
            //%d oznacza odwołanie się do elementu, który jest typu int, \n oznacza przejście do nowej linii
            //każdemu %d odpowiadają kolejne argumenty po napisie w ""
        }

        //Dokładnie taka sama logika dla groszy
        while (amountGroszy > 0) {
            for (int i = 0; i < numberOfGroszy.length; i++) {
                if (amountGroszy >= denominationsOfGrosze[i]) {
                    amountGroszy = amountGroszy - denominationsOfGrosze[i];
                    numberOfGroszy[i]++;
                    break;
                }
            }
        }
        for (int i = 0; i < denominationsOfGrosze.length; i++) {
            if(numberOfGroszy[i] > 0)
                System.out.printf("%d x %d gr\n", numberOfGroszy[i], denominationsOfGrosze[i]);
        }
    }
}
