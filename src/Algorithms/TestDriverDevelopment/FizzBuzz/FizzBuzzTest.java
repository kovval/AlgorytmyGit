package Algorithms.TestDriverDevelopment.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-10.
 */
public class FizzBuzzTest {
    FizzBuzz testObject = new FizzBuzz();

    @Test
    public void shoutReturnArrayWhenZeroProvided() {
        Assert.assertArrayEquals(new String[0], testObject.fizzBuzz(0));
    }

    @Test
    public void shouldReturnArrayithOnly1Whwen1Privided() {
        Assert.assertArrayEquals(new String[]{ "1" }, testObject.fizzBuzz(1));
    }

 @Test
    public void shoudReturnArrayWithOneandTwo() {
     Assert.assertArrayEquals(new String[]{ "1" , "2"}, testObject.fizzBuzz(2));
    }
    @Test
    public void shoudReturnArrayWithOneandTwoandFizz() {
     Assert.assertArrayEquals(new String[]{ "1" , "2", "Fizz"}, testObject.fizzBuzz(3));
    }@Test
    public void shoudReturnArrayWithOneandTwoandFizzandBuzz() {
     Assert.assertArrayEquals(new String[]{ "1" , "2", "Fizz","4", "Buzz"}, testObject.fizzBuzz(5));
    }
    @Test
    public void shoudReturnArrayWithOneandTwoandFizzandBuzzwhensisProvided() {
     Assert.assertArrayEquals(new String[]{ "1" , "2", "Fizz","4", "Buzz", "Fizz"}, testObject.fizzBuzz(6));
    }
    @Test
    public void shoudReturnArrayWithOneandTwoandFizzandBuzzwhensisNoeTenProvided() {
     Assert.assertArrayEquals(new String[]{ "1" , "2", "Fizz","4", "Buzz", "Fizz", "7" , "8", "Fizz", "Buzz"}, testObject.fizzBuzz(10));
    }

    @Test
    public void shouldResultArrayWithOpenedeWhenFifteenProvided() {
//        arrayContainsElements(array, "1", "2", "3" ....);
        Assert.assertEquals("Fizz", testObject.getStringRepresentation(102));
    }
//    public void test(int input, String[] expectedoutput){
//        Assert.assertArrayEquals(expectedoutput, testObject.fizzBuzz());
//    }

}
