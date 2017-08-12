package Algorithms;

public class PESELVER extends AbstractAlgorithm {
    @Override
    public String getName() {
       return "Tutaj mamy tylko algorytm do przemnożenia";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int[] ver = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        String iD =  input[1];
        int sumOfIdVeryfication = 0;
        int[] pEsel = new int[11];
        for (int i = 0; i < iD.length(); i++) {
            sumOfIdVeryfication += iD.charAt(i)*ver[i];
        }
        if (sumOfIdVeryfication%10 == 0) {
            System.out.print("Pesel prawidłowy, ale czy ubezpieczenie jest?");
        } else {
            System.out.print("dziadek pewnie znów się pomylił");
        }




    }
}
