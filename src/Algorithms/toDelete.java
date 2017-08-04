package Algorithms;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.awt.SunHints;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-04.
 */
public class toDelete extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        ArrayList<Integer> delateReps = new ArrayList<>();

        for (int i = 2; i <= input.length-1; i++) {
            delateReps.add(Integer.parseInt(input[i]));
        }
        int toDelate = Integer.parseInt(input[1]);


        for (int i = 0; i < delateReps.size(); i++) {
            if(delateReps.get(i)==toDelate) {
                delateReps.remove(i);
                i=0;
            }
        }
        for (Integer element : delateReps){
            System.out.printf("%d\n", element);
        }

    }

}




