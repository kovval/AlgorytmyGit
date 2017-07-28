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
    public String runAlgorithm(String[] input) {

        int pole = Integer.parseInt(input[1]);
//        if (Math.sqrt(pole) % 1 == 0) {


//            int dlugoscTablicy = (int) Math.sqrt(pole);
        int dlugoscTablicy = pole;
            String[][] tablicaWarcabow = new String[dlugoscTablicy][dlugoscTablicy];

            String biale = _bialeCzarne[0];
            String czarne = _bialeCzarne[1];

            for (int i = 0; i < dlugoscTablicy; i++) {
                for (int j = 0; j < dlugoscTablicy; j++) {
                    if ((j+i) % 2 == 0)
                        tablicaWarcabow[i][j] = czarne;
                    else {
                        tablicaWarcabow[i][j] = biale;

                    }
                }
            }

                for (int i = 0; i < dlugoscTablicy; i++) {
                    for (int j = 0; j < dlugoscTablicy; j++) {
                        System.out.printf("%s  ", tablicaWarcabow[i][j]);
                        if (j == dlugoscTablicy - 1) System.out.print("\n");
                    }
                }
//            }
        return null;
        }

    }


