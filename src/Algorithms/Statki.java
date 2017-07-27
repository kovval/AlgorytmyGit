package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class Statki extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }
    private String _literka[] = {"A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "W", "V", "X",
            "Y", "Z"};
    @Override
    public void runAlgorithm(String[] input) {
// sprawdzic czy wczytana liczba jest wymiarowalna
        // wczytywac tablice literek do robienia poziomu
        // ma to wygladac mniej wiecej tak
        // tablicaStatki[i][j] = Tablica [listaLiter.charAt[i]][numer]
        //inna metoda wywołania liczby pierwiastkowalnej
        //        double sqrt = Math.sqrt(liczbaKwadratu);
        //        liczbaKwadratu = (int) sqrt;

        int liczbaKwadratu = Integer.parseInt(input[1]);
        if(Math.sqrt(liczbaKwadratu)%1==0){
            System.out.println(liczbaKwadratu);

            int dlugoscTablicy = (int)Math.sqrt(liczbaKwadratu);
            String[][] statki = new String[dlugoscTablicy][dlugoscTablicy];

            for(int i=0; i< dlugoscTablicy; i++) {
                for (int j= 0; j < dlugoscTablicy; j++) {

                    statki[i][j] = _literka[i]+(j+1);

                }
            }

            for(int i=0; i< dlugoscTablicy; i++) {
                for (int j = 0; j < dlugoscTablicy ; j++) {
                    System.out.printf("%s ", statki[i][j]);
                    if (j==dlugoscTablicy-1) System.out.print("\n");
                }
            }

        }
        else {
            System.out.println("zła wartość");
        }

    }
}
