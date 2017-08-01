//package Algorithms;
//
///**
// * Created by RENT on 2017-07-31.
// */
//public class SzukanieLidera extends AbstractAlgorithm {
//    @Override
//    public String getName() {
//        return null;
//    }
//
//    @Override
//    public String runAlgorithm(String[] input) {
//
//        int[] lider = new int[input.length-1];
//
//        int[] tablicaZliczanie = new int[Integer.MAX_VALUE];
//
//        for(int dlugoscTablicy = 1; dlugoscTablicy < lider.length; dlugoscTablicy++) {
//            lider[dlugoscTablicy] = Integer.parseInt(input[dlugoscTablicy+1]);
//        }
//            for(int i=0 ; i < lider.length; i++) {
//                for(int j = 0; j < tablicaZliczanie.length; j++){
//                    if(tablicaZliczanie[j] == lider[j]){
//                        tablicaZliczanie[j]++;
//                    }
//
//                }
//            }
//
//            int licznik = Integer.MIN_VALUE;
//            for(int i =0; i< tablicaZliczanie.length;i++) {
//                if(tablicaZliczanie[i]>licznik) {
//
//
//                }
//            }
//
//
//
//
//
//        return null;
//    }
//}
