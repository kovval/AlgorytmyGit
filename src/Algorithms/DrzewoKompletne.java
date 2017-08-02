package Algorithms;


public class DrzewoKompletne extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "wywolywane drzwo";
    }
    private String _Drzewo[];
    int _level;
    int _height;
//
//    = {"A", "B", "C", "D", "E", "F", "G", "H",
//            "I", "J", "K", "L", "M", "N", "O", "P",
//            "Q", "R", "S", "T", "U", "W", "V", "X",
//            "Y", "Z"};


    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length-1;
        _Drzewo = new String[getArraySize(n)];


        int i;
        for(i = 0; i <n; i++){
            _Drzewo[i] = input[i+1];

        }

        System.out.printf("Poziom drzewa: %d\n " +
                "Wysokość dzrewa %d\n " +
                "Poziom drzewa jest %s", _level, _height, _Drzewo[0]);

        for(int j = 0; j < _Drzewo.length; j++){
            String elementLewy;
            String elementPrawy;
            String element = "";
            try{
                elementLewy = _Drzewo[2*j+1];
//                elementPrawy = _Drzewo[2*j+2];
                element = _Drzewo[j];
            }
            catch (Exception ex){
                System.out.printf(" Element %s jest lisciem\n", element);

            }
        }






        
    }



        private int getArraySize(int n){
            int currentSize = 0;
            int iterator = 0;
            while(currentSize < n) {
                currentSize = currentSize + (int)Math.pow(2d, (double) iterator);
                iterator++;

            }
            _level = iterator-1;
            _height = iterator;
            return currentSize;
        }


    }

