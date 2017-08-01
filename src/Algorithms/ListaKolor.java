package Algorithms;

import java.util.ArrayList;


/**
 * Created by RENT on 2017-08-01.
 */
public class ListaKolor extends AbstractAlgorithm {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String runAlgorithm(String[] input) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("niebieski");
        lista.add("czarny");
        lista.add("zolty");
        lista.add("fioletowy");
        lista.add(0, "pink");
        lista.add(5, "green");

        System.out.println(lista);


        return null;
    }
}
