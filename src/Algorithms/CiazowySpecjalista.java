package Algorithms;

public class CiazowySpecjalista extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        double x = Double.parseDouble(input[1]);
        double y = Double.parseDouble(input[2]);
        double z = Double.parseDouble(input[3]);
        double plod = Math.abs(((y-((x+y)/z))/((1/z)-1))*12);


        System.out.printf("Dla podanych danych ciaza bedzie trwac %1.0f miesiecy", plod);

    }
}
