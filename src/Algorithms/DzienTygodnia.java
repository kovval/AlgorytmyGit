package Algorithms;

public class DzienTygodnia extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "dni tygodnia wzorowane szyfrem cezara";
    }
    //Wczytuje sobię ilość dni tygodnia jako tablicę
    private String _tyg[] = {"Pn", "Wt", "Srd", "Cz", "Pt", "Sob", "Nd" };

    @Override
    public void runAlgorithm(String[] input) {
        String dzien = input[1];// wczytuje sobie wybrany dzien
        int n = Integer.parseInt(input[2]);//wczytuje o ile chce przesunąć
        for(int i = 0; i < _tyg.length; i++) {//robie pętle by porównać do którego dnia pasuje podany przezemnie dizeń
            if(_tyg[i].equals(dzien) ) { // porównuje aż znajdzie odpowiedni dzien na tablicy
                int move = (i+n)%7; // suma dnia tygodnia i przesuniecie przez ilosc elementów w stringu _tyg, i jest potrzebne by wwskazać dzien
                System.out.printf("%s",_tyg[move]);// dzien tygodnia + to co było po modulo 7
            }
        }
    }
}
