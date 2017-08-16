package TestDriverDevelopment.VendingMachineTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Executor;

/**
 * Created by RENT on 2017-08-16.
 */
public class VendingMachineTest {
    @Test
    public void nothing() {
        Produkty produkty = null;
        Kasa kasa = null;
        VendingMachine vendingMachine = new VendingMachine(kasa, produkty);

    }


}
