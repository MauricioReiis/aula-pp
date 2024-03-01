import org.example.DetentoFurtoPena;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetentoFurtoPenaTest {

    @Test
    void testGetPena() {
        DetentoFurtoPena pena = new DetentoFurtoPena();
        String expectedPena = "Pena do detento de furto";
        assertEquals(expectedPena, pena.getPena());
    }
}
