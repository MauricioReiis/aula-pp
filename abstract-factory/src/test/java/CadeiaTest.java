import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadeiaTest {

    @Test
    void testSetPena() {
        Pena pena = new DetentoFurtoPena();
        Cadeia cadeia = new Cadeia();
        cadeia.setPena(pena);
        assertEquals(pena, cadeia.getPena());
    }

    @Test
    void testGetPena() {
        Pena pena = new DetentoHomicidioPena();
        Cadeia cadeia = new Cadeia();
        cadeia.setPena(pena);
        assertEquals(pena, cadeia.getPena());
    }

    @Test
    void testSetBloco() {
        Bloco bloco = new DetentoFurtoBloco();
        Cadeia cadeia = new Cadeia();
        cadeia.setBloco(bloco);
        assertEquals(bloco, cadeia.getBloco());
    }

    @Test
    void testGetBloco() {
        Bloco bloco = new DetentoHomicidioBloco();
        Cadeia cadeia = new Cadeia();
        cadeia.setBloco(bloco);
        assertEquals(bloco, cadeia.getBloco());
    }

    @Test
    void testFactoryMakerFurto() {
        CadeiaFactory factory = Cadeia.FactoryMaker.makeFactory(Cadeia.FactoryMaker.DetentoType.FURTO);
        assertNotNull(factory);
        assertTrue(factory instanceof DetentoFurtoFactory);
    }

    @Test
    void testFactoryMakerHomicidio() {
        CadeiaFactory factory = Cadeia.FactoryMaker.makeFactory(Cadeia.FactoryMaker.DetentoType.HOMICIDIO);
        assertNotNull(factory);
        assertTrue(factory instanceof DetentoHomicidioFactory);
    }
}
