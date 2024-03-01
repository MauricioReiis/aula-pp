import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetentoHomicidioFactoryTest {

    @Test
    void testEmitirBloco() {
        CadeiaFactory factory = new DetentoHomicidioFactory();
        Bloco bloco = factory.emitirBloco();
        assertNotNull(bloco);
        assertTrue(bloco instanceof DetentoHomicidioBloco);
    }

    @Test
    void testEmitirPena() {
        CadeiaFactory factory = new DetentoHomicidioFactory();
        Pena pena = factory.emitirPena();
        assertNotNull(pena);
        assertTrue(pena instanceof DetentoHomicidioPena);
    }
}
