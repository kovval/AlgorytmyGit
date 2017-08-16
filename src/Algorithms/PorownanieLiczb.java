package Algorithms;

public class PorownanieLiczb extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "bedziemy porownywac :D";
    }

    @Override
    public void runAlgorithm(String[] input) {// myślałem by zrobić to inaczej, ale za każdym razem wychodziło na to, że najlepiej będzie
                                                // zrobić to na switch - case
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[3]);
        String c = input[2];

        System.out.println(a+" "+c+" " +b);
        switch(c){
            case "==":
                if (a == b) {
                    System.out.println("PRAWDA");
                } else {
                    System.out.println("FAŁSZ");
                }
                break;
            case ">=":
                if (a >= b) {
                    System.out.println("PRAWDA");
                } else {
                    System.out.println("FAŁSZ");
                }
                break;
            case "<=":
                if (a <= b) {
                    System.out.println("PRAWDA");
                } else {
                    System.out.println("FAŁSZ");
                }
                break;
            case "!=":
                if (a != b) {
                    System.out.println("PRAWDA");
                } else {
                    System.out.println("FAŁSZ");
                }
                break;

            case ">":
                if (a == b) {
                    System.out.println("PRAWDA");
                } else {
                    System.out.println("FAŁSZ");
                }
                break;
            case "<":
                if (a == b) {
                    System.out.println("PRAWDA");
                } else {
                    System.out.println("FAŁSZ");
                }
                break;
        }
    }
}
