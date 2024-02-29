import org.example.DetentoFurtoBloco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetentoFurtoBlocoTest {
    @Test
    void testGetBloco() {
        DetentoFurtoBloco bloco = new DetentoFurtoBloco();
        String expectedBloco = "Bloco detento furto";
        assertEquals(expectedBloco, bloco.getBloco());
    }
}
