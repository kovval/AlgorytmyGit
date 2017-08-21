package Algorithms.TestDriverDevelopment.BubbleSort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-10.
 */
public class BubllesortTest {
    BubbleSort testObject = new BubbleSort();

    @Test
    public void firstLineToTest() {
        Assert.assertArrayEquals(new String[1], testObject.bublleSort(1));

    }

}
