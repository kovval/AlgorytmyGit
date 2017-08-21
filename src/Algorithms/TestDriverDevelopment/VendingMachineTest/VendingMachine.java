package Algorithms.TestDriverDevelopment.VendingMachineTest;


public class VendingMachine {
    private final Kasa kasa;
    private final Produkty produkty;

    VendingMachine(Kasa kasa, Produkty produkty) {

        this.kasa = kasa;
        this.produkty = produkty;
    }

    public String execute(String input) {
        if(input.length() > 1) return input.substring(0, input.length()-1);
        return "";

    }
}
