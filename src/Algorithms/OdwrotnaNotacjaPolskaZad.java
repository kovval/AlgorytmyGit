package Algorithms;

import java.util.Stack;

public class OdwrotnaNotacjaPolskaZad extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        String enter = "(1 + 2 * 3 - 4) / 6 ^ 7 + 4) / 3 = ";
        String[] inputArray = enter.split(" ");

        Stack<String> stack = new Stack<>();
        String helper = "";

        for (String element : inputArray) {
            switch (element) {
                case "=":
                    while (!stack.empty()) {
                        System.out.printf("%s", stack.pop());
                    }
                    break;
                case "(":
                    stack.push(element);
                case ")":
                    helper = stack.pop();
                    while (!helper.equals("(")) {
                        System.out.printf("%s", helper);
                        helper = stack.pop();
                    }
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    while (!stack.empty()) {
                        if ((GetOperatorLevel(element) == 3) || GetOperatorLevel(element) >= GetOperatorLevel(stack.peek())) {
                            break;
                        } else
                            System.out.printf("%s", stack.pop());
                    }
                    stack.push(element);
                    break;
                default:
                    System.out.printf("%s", element);
            }

        }
    }

    private int GetOperatorLevel(String element) {
        switch (element) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return -1;
        }

    }
}


