package Algorithms;

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
    public String runAlgorithm(String[] input) {

        StringBuilder litery = new StringBuilder();
        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++) {
            String word = input[wordsCounter];

            for (int i = 0; i < word.length(); i++) {
                litery.append(word.charAt(i));
            }
        }
        System.out.println(litery);


        TreeMap<Character, Integer> liczenieLiter = new TreeMap<>();

        for(int i = 0; i< litery.length(); i++) {
            Character przeliterowane = litery.charAt(i);

            if(liczenieLiter.containsKey(przeliterowane)) {
                int occurences = liczenieLiter.get(przeliterowane);
                liczenieLiter.put(przeliterowane, occurences+1);
            } else {
                liczenieLiter.put(przeliterowane, 1);
            }

        }
        System.out.println(liczenieLiter);

            return null;
        }

}







