package Algorithms;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by Kovval on 2017-07-30.
 */
public class ZliczanieLiter extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {

        StringBuilder sb = new StringBuilder();
        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++) {
            String word = input[wordsCounter];

            for (int i = 0; i < word.length(); i++) {
                sb.insert(i, word.charAt(i));
//                    sb.append(word.charAt(i));
            }

        }
        System.out.println(sb);

        TreeMap<Character, Integer> liczenieLiter = new TreeMap<>();

        for (int i = 0; i < sb.length(); i++) {
            Character przeliterowane = sb.charAt(i);
            if (liczenieLiter.containsKey(przeliterowane)) {
                int reps = liczenieLiter.get(przeliterowane);
                liczenieLiter.put(przeliterowane, reps + 1);
            } else {
                liczenieLiter.put(przeliterowane, 1);
            }

        }
        System.out.println(liczenieLiter);


    }

}








