import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


@RunWith(value = MockitoJUnitRunner.class)

public class VendingmachineTest {

    Kasa kasa;
    Produkty produkty;


    AutomatZBatonami testObject = new AutomatZBatonami(kasa, produkty);

    @Before
    public void init(){
        kasa = Mockito.mock(Kasa.class);
        produkty = Mockito.mock(Produkty.class);
        testObject = new AutomatZBatonami(kasa, produkty);

    }


    @Test
    public void kiedyWkladamyDolaraKasaGoPrzyjmuje() {
        testObject.execute("D");
        verify(kasa).wlozDolar();
        checkReturnchangeAndNoMoreInteractions();
    }

    @Test
    public void kiedyWkladamyCwiercDolaraKasaGoPrzyjmuje() {
        testObject.execute("Q");
        verify(kasa).wlozCwiercDolara();
        checkReturnchangeAndNoMoreInteractions();
    }

    //N
    //d
    @Test
    public void kiedyWloze2MonetyKasaPowinajePrzyjac() {
        testObject.execute("DQ");
        verify(kasa).wlozDolar();
        verify(kasa).wlozCwiercDolara();
        checkReturnchangeAndNoMoreInteractions();
    }

    @Test
    public void kiedyWkladamycentaalbodziesiecCentow() {
        testObject.execute("Nd");
        verify(kasa).wlozNikiel();
        verify(kasa).wlozCent();
        checkReturnchangeAndNoMoreInteractions();

    }
    @Test
    public void kiedyWkladamyDwaDolary() {
        testObject.execute("DD");
        verify(kasa, Mockito.times(2)).wlozDolar();

        checkReturnchangeAndNoMoreInteractions();

    }
    @Test
    public void kiedyWkladamyDolaraWybiereProduktnaKtoryMnieInteresujeiNieStaCNaNiego() {
        when(kasa.zwrocReszte()).thenReturn("D");
        String result = testObject.execute("DA");
        verify(kasa).wlozDolar();
        checkReturnchangeAndNoMoreInteractions();
        assertEquals("D", result);
    }

    private void checkReturnchangeAndNoMoreInteractions() {
        verify(kasa).zwrocReszte();
        verifyNoMoreInteractions(kasa);
    }


}
