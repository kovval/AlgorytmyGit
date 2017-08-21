package Algorithms.TestDriverDevelopment.LiczbaNaSlowo;

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
        Assert.assertEquals("piędziesiątpięć", testObject.slowo(55));
    }
    @Test
    public void storeturnif100() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("sto", testObject.slowo(100));
    }

    @Test
    public void storeturnif150() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("stopiędziesiąt", testObject.slowo(150));
    }
    @Test
    public void dziewięćsetdziewiędziesiątturnif990() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("dziewięćsetdziewiedzieisąt", testObject.slowo(990));
    }
    @Test
    public void dziewięćsetdziewiędziesiątdziewięćturnif999() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("dziewięćsetdziewiedzieisątdziewięć", testObject.slowo(999));
    }

    @Test
    public void dwiesciesiedemdziesiatryturnif273() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("dwieściesiedemdziesiąttrzy", testObject.slowo(273));
    }
    @Test
    public void dwiesciesiedemnasciegiveBack217() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("dwieściesiedemnaście", testObject.slowo(217));
    }
    @Test
    public void tysiac() {
        LiczbaNaSlowo testObject = new LiczbaNaSlowo();
        Assert.assertEquals("tysiącstojeden", testObject.slowo(1101));
    }

    }


