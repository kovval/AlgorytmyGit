package TestDriverDevelopment.LiczbaNaSlowo;

import org.junit.Assert;
import org.junit.Test;

public class LiczbaNaSlowoTest {

    LiczbaNaSlowo testObject = new LiczbaNaSlowo();

    @Test
    public void oneREturnJeden() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("jeden", testObject.slowo(1));
    }
    @Test
    public void twoReturnDwa() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("dwa", testObject.slowo(2));
    }
    @Test
    public void nineReturndziewiec() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("dziewięć", testObject.slowo(9));
    }

    @Test
    public void fifteenReturnpięćnaście() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("pietnaście", testObject.slowo(15));
    }
    @Test
    public void fiftyfiveReturnpędziesiątpięć() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("piędziesiątpięc", testObject.slowo(55));
    }


    }


