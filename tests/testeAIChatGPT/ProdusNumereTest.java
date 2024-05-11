package testeAIChatGPT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import MainPackage.Main;


public class ProdusNumereTest {

    @Test
    public void testProdusPozitiv() {
        Assertions.assertEquals(20, Main.produsNumere(4, 5));
    }

    @Test
    public void testProdusNegativPozitiv() {
        Assertions.assertEquals(-20, Main.produsNumere(-4, 5));
    }

    @Test
    public void testProdusNegativ() {
        Assertions.assertEquals(20, Main.produsNumere(-4, -5));
    }

    @Test
    public void testProdusCuZero() {
        Assertions.assertEquals(0, Main.produsNumere(0, 5));
        Assertions.assertEquals(0, Main.produsNumere(4, 0));
    }

    @Test
    public void testProdusNumereMari() {
        Assertions.assertEquals(1000000, Main.produsNumere(1000, 1000));
    }
}