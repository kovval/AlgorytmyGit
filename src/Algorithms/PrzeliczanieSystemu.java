package Algorithms;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-03.
 */
public class PrzeliczanieSystemu extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "przeliczamy na ";
    }

    @Override
    public void runAlgorithm(String[] input) {




        Stack stosCufr = new Stack<>();
        int liczbaDoZminy = Integer.parseInt(input[1]);
        int podstawa = Integer.parseInt(input[2]);

        while(liczbaDoZminy > 0) {
            stosCufr.push(liczbaDoZminy%podstawa);
            liczbaDoZminy = Math.floorDiv(liczbaDoZminy, podstawa);
        }
            while( !stosCufr.empty()) {
                System.out.printf("%d", stosCufr.peek());
                stosCufr.pop();
            }




    }
}
