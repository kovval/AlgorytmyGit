package Algorithms;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-03.
 */
public class OdwrotnaNotacjaPolska extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "ONP";
    }

    @Override
    public void runAlgorithm(String[] input) {


        Stack owp = new Stack<>();
        for (int i = 1; i < input.length; i++) {
            switch (input[i]) {
                case "M":
                    int k = (Integer) owp.pop();
                    int d = (Integer) owp.pop();
                    int sum = k * d;
                    owp.push(sum);

                    break;

                case "D":
                     k = (Integer) owp.pop();
                     d = (Integer) owp.pop();
                    sum = k + d;
                    owp.push(sum);
                    break;


                case "O":
                     k = (Integer) owp.pop();
                    d = (Integer) owp.pop();
                    sum = d - k;
                    owp.push(sum);
                    break;

                case "I":
                     k = (Integer) owp.pop();
                     d = (Integer) owp.pop();
                    sum = d / k;
                    owp.push(sum);
                    break;

                case "R":
                    System.out.printf("%d", owp.pop());
                    break;

                default:
                    owp.push(Integer.parseInt(input[i]));

            }



        }

    }
}
