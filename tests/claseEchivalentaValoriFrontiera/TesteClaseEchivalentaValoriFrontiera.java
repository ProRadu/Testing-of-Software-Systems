package claseEchivalentaValoriFrontiera;

import MainPackage.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteClaseEchivalentaValoriFrontiera {

    @Test
    public void testCMMDivizorC() {
        assertEquals(-1, Main.CMMDivizorC(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testCMMMultipluC() {
        assertEquals(-2147483648, Main.CMMMultipluC(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testSumaTuturorNumerelorDintreCele2Numere() {
        assertEquals(-2147483648, Main.produsNumere(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testImpartireNumere() {
        assertEquals("Nu putem imparti la 0!", Main.impartireNumere(Integer.MIN_VALUE, 0));
    }
}

