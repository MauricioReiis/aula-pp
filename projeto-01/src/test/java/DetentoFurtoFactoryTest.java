import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetentoFurtoFactoryTest {

    @Test
    void testEmitirBloco() {
        CadeiaFactory factory = new DetentoFurtoFactory();
        Bloco bloco = factory.emitirBloco();
        assertNotNull(bloco);
        assertTrue(bloco instanceof DetentoFurtoBloco);
    }

    @Test
    void testEmitirPena() {
        CadeiaFactory factory = new DetentoFurtoFactory();
        Pena pena = factory.emitirPena();
        assertNotNull(pena);
        assertTrue(pena instanceof DetentoFurtoPena);
    }
}
