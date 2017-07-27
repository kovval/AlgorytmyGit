package Algorithms;

/**
 * Created by RENT on 2017-07-26.
 */
public class SortowanieWzglendemOdleglosci extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sortowanie wzgledem odgleglosci od punktu";
    }

    @Override
    public void runAlgorithm(String[] input) {
        //sortowanie wzgledem punktu: 3, punkt: 1 x = 0 y = 0, 3 x = 5 y = 5, 2 x =1 y = -1
        // sortowanie wzgledem punktu 3 1 0 0 3 5 5 2 1 -1
        //sqrt(x^2+y^2)

        int n = Integer.parseInt(input[1]); // ilosc testowanych przypadkow
        int tablicaPuntkow[][] = new int[n][3];

        int iterator = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                tablicaPuntkow[i][j] = Integer.parseInt(input[iterator]);
                iterator++;
            }

        }

        int tablicaWynikow[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            tablicaWynikow[i][0] = tablicaPuntkow[i][0];
            double x = Math.sqrt(Math.pow((double) tablicaPuntkow[i][1], 2d));
            double y = Math.sqrt(Math.pow((double) tablicaPuntkow[i][2], 2d));
            double sqrt = Math.sqrt(x + y);
            int round = (int) Math.round(sqrt);
            tablicaWynikow[i][1] = round;
        }


//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - 1; j++) {

//                if (tablicaWynikow[j][1] > tablicaWynikow[j + 1][1]) {
//                    int temp[][] = new int[n][2];
//
//                    temp[j][1] = tablicaWynikow[j][1];
//                    temp[j][0] = tablicaWynikow[j][0];//zapamietujemy
//
//                    tablicaWynikow[j][0] = tablicaWynikow[j + 1][0];
//                    tablicaWynikow[j][1] = tablicaWynikow[j + 1][1];//podmieniamy wieksze lub rowne
//
//                    tablicaWynikow[j + 1][0] = temp[j][0];  // wciskamy zapamietana wartosc
//                    tablicaWynikow[j + 1][1] = temp[j][1];
//
//                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if (tablicaWynikow[j][1] > tablicaWynikow[j + 1][1]) {
                            int temp[] = new int[2];
                            temp[0] = tablicaWynikow[j][0];
                            temp[1] = tablicaWynikow[j][1];

                            tablicaWynikow[j][0] = tablicaWynikow[j + 1][0];
                            tablicaWynikow[j][1] = tablicaWynikow[j + 1][1];

                            tablicaWynikow[j + 1][0] = temp[0];
                            tablicaWynikow[j + 1][1] = temp[1];
                        }
                    }

                    for (i = 0; i < n; i++) {
                        int punkt = tablicaWynikow[i][0];
                        for (int j = 0; j < n; j++) {
                            if (punkt == tablicaPuntkow[j][0])
                                System.out.printf("punkt: %d; X: %d; Y: %d\n",
                                        punkt, tablicaPuntkow[j][1], tablicaPuntkow[j][2]);
                        }
                    }

//                    for (i = 0; i < n; i++) {
//                        for (int j = 0; j < n - 1; j++) {
//
//                            System.out.printf("[%d] \n", tablicaWynikow[i][j]);
//
//                        }
                }
//                    }
                }
            }






