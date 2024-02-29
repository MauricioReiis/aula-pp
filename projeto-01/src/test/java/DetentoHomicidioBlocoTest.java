import org.example.DetentoHomicidioBloco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetentoHomicidioBlocoTest {

    @Test
    void testGetBloco() {
        DetentoHomicidioBloco bloco = new DetentoHomicidioBloco();
        String expectedBloco = "Bloco do detento de homicidio";
        assertEquals(expectedBloco, bloco.getBloco());
    }
}
