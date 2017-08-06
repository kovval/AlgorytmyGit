package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class Warcaby extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    private String _bialeCzarne[] = {"B", "C"};

    @Override
    public void runAlgorithm(String[] input) {

        int dlugosc = Integer.parseInt(input[1]);
        int szerokosc = Integer.parseInt((input[2]));


        int dlugoscTablicy = dlugosc;
        int szerokoscTablicy = szerokosc;
        String[][] tablicaWarcabow = new String[dlugoscTablicy][szerokoscTablicy];

        String biale = _bialeCzarne[0];
        String czarne = _bialeCzarne[1];

        for (int i = 0; i < dlugoscTablicy; i++) {
            for (int j = 0; j < szerokoscTablicy; j++) {
                if ((j + i) % 2 == 0)
                    tablicaWarcabow[i][j] = czarne;
                else {
                    tablicaWarcabow[i][j] = biale;

                }
            }
        }

        for (int i = 0; i < dlugoscTablicy; i++) {
            for (int j = 0; j < szerokoscTablicy; j++) {
                System.out.printf("%s  ", tablicaWarcabow[i][j]);
                if (j == szerokoscTablicy - 1) System.out.print("\n");
            }
        }
    }
}


