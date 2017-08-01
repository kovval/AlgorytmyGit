package Algorithms;

import Struktury.mList;



/**
 * Created by RENT on 2017-08-01.
 */
public class TestowanieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "test";
    }

    @Override
    public String runAlgorithm(String[] input) {
        mList lista = new mList();

//        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25, lista);
        lista.elementBeetween(16, lista, 16);
        lista.addElementAtLast(98, lista);
        lista.elementNextAfter(104, 98, lista);

        lista.printAllElement(lista);



return null;
    }

    }

