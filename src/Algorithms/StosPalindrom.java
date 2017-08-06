package Algorithms;

import java.util.ArrayList;
import java.util.Stack;

public class StosPalindrom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "stos palindrom";
    }

    @Override
    public void runAlgorithm(String[] input) {
        char[] changeToChar = input[1].toCharArray();

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> heep = new Stack<>();

        for (int i = 0; i < changeToChar.length; i++) {
            list.add(Character.getNumericValue(changeToChar[i]));

        }
        int i = 0;
        int halfElement = Math.floorDiv(list.size(), 2);
        while (i < halfElement) {
            heep.add(list.get(i));
            i++;
        }
        if (list.size() % 2 == 1) {
            i++;
        }
        while (i < list.size()) {
            if (heep.pop() != list.get(i)) {
                System.out.printf("This array is not a Palindrom!");
                return;
            }
            i++;
        }
        System.out.printf("This array is a Palindrom!");

    }
}
