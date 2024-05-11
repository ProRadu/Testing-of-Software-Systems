package mutanti;

import MainPackage.Main;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test3 {

    @Test
    public void testImpartireNumereCuNoiClaseDeEchivalenta() {
        Random rand = new Random();
        int randomNumarator1 = rand.nextInt();
        int randomNumarator2 = rand.nextInt();
        int randomNumarator3 = rand.nextInt();
        String rezultat1 = Main.impartireNumere(randomNumarator1, 0);
        String rezultat2 = Main.impartireNumere(randomNumarator2, -1);
        String rezultat3 = Main.impartireNumere(randomNumarator3, 1);
        String rezultatNumeric1 = "Nu putem imparti la 0!";
        double rezultatNumeric2 = -randomNumarator2;
        double rezultatNumeric3 = randomNumarator3;

        assertEquals(rezultatNumeric1, rezultat1);
        assertEquals( rezultatNumeric2, Double.parseDouble(rezultat2.substring(rezultat2.lastIndexOf('=') + 1).replace(",", ".")),0.000001);
        assertEquals( rezultatNumeric3, Double.parseDouble(rezultat3.substring(rezultat3.lastIndexOf('=') + 1).replace(",", ".")),0.000001);
    }

    @Test
    public void testImpartireNumereCuNoiClaseDeEchivalentaOmorareMutantInmultire() {
        Random rand = new Random();
        int numarator = rand.nextInt();
        int numitor = rand.nextInt();

        String rezultatAsteptat = String.format("%d / %d = %f", numarator, numitor, (double) numarator / numitor);
        String rezultatObtinut = Main.impartireNumere(numarator, numitor);

        assertEquals(rezultatAsteptat, rezultatObtinut);
    }

    @Test
    public void testCMMDivizorC() {
        assertEquals(6, Main.CMMDivizorC(12, 18));
        assertEquals(5, Main.CMMDivizorC(10, 5));
        assertEquals(1, Main.CMMDivizorC(17, 23));
        assertEquals(10, Main.CMMDivizorC(0, 10));
    }

    @Test
    public void testCMMMultipluC() {
        assertEquals(36, Main.CMMMultipluC(12, 18));
        assertEquals(10, Main.CMMMultipluC(10, 5));
        assertEquals(391, Main.CMMMultipluC(17, 23));
        assertEquals(0, Main.CMMMultipluC(0, 10));
    }

    @Test
    public void testSumaTuturorNumerelorDintreCele2Numere() {
        assertEquals(45, Main.sumaTuturorNumerelorDintreCele2Numere(5, 10));
        assertEquals(0, Main.sumaTuturorNumerelorDintreCele2Numere(-2,2));
        assertEquals(0, Main.sumaTuturorNumerelorDintreCele2Numere(0, 0));
        assertEquals(45, Main.sumaTuturorNumerelorDintreCele2Numere(10, 5));
    }

    @Test
    public void testProdusNumere() {
        assertEquals(60, Main.produsNumere(12, 5));
        assertEquals(0, Main.produsNumere(0, 10));
        assertEquals(-50, Main.produsNumere(-10, 5));
    }

    @Test
    public void testImpartireNumere() {
        String rezultatFormatare = Main.impartireNumere(5, 2);
        double rezultatNumeric = 2.5;

        assertTrue(rezultatFormatare.equals("5 / 2 = 2.500000") || rezultatFormatare.equals("5 / 2 = 2,500000"));

        assertEquals(rezultatNumeric, Double.parseDouble(rezultatFormatare.substring(rezultatFormatare.lastIndexOf('=') + 1).replace(",", ".")), 0.000001);
    }


    //Teste pentru graful de acoperire pentru functia „sumaTuturorNumerelorDintreCele2Numere”
    @Test
    public void testIntervalCrescator() {
        int rezultat = Main.sumaTuturorNumerelorDintreCele2Numere(1, 5);
        assertEquals(15, rezultat);
    }

    @Test
    public void testIntervalDescrescator() {
        int rezultat = Main.sumaTuturorNumerelorDintreCele2Numere(5, 1);
        assertEquals(15, rezultat);
    }

    @Test
    public void testBoundaryCondition() {
        int start = 5;
        int end = 5;
        int expectedSum = 5;
        int actualSum = Main.sumaTuturorNumerelorDintreCele2Numere(start, end);
        assertEquals(expectedSum, actualSum);
    }

}
