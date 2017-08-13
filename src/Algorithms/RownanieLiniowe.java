package Algorithms;

import java.util.Scanner;

public class RownanieLiniowe extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "rownanie liniowe, mozna oczywiscie zrobić to za pomocą try catch no i wydaje mi sie, że nie ma sensu pisać programów pod tą funkcje o ile nie jest konieczna";
        //import java.io.IOException
        //potem trzeba jeszcze zrobić
        //try {
    }

    @Override
    public void runAlgorithm(String[] input) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj b: ");
        double b = sc.nextDouble();
        System.out.println("Podaj b: ");
        double c = sc.nextDouble();
        if(a == 0 ) {
            System.out.println("Równanie ma nieskonczenie dużo rozwiązan0" );
            return;
        }
        if (c-b == 0) {
            System.out.println("równanie nie ma rozwiązań");
            return;
        }
        double x = (c-b)/a;

        System.out.printf("%2.2f", x);

    }
}
