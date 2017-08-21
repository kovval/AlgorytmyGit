package Algorithms.TestDriverDevelopment.RomeNumbers;

/**
 * Created by RENT on 2017-08-11.
 */
public class RomanConverter {
    private String[] romanNumbers ={"I" , "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    private int[] romanValues ={1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public String convert(int number) {
        String result = "";

        for(int romanIndex = romanNumbers.length-1; number > 0 ; romanIndex--) {
            while (romanValues[romanIndex] <= number ) {

                    result += romanNumbers[romanIndex];
                    number -= romanValues[romanIndex];

            }
        }
//        if(number >= 10) {
//            while (number >= 10) {
//                result += "X";
//                number -= 10;
//            }
//        }
//
//        if(number == 9) return result += "IX";
//        if(number == 4) return result +="IV";
//        if(number >= 5) {
//            result += "V";
//            number -= 5;
//        }
//
//        for(int i = 0; i < number; i++) {
//            result += "I";
//        }
        return result;
    }
}
