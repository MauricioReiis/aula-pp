import org.example.DetentoHomicidioPena;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetentoHomicidioPenaTest {
    @Test
    void testGetPena() {
        DetentoHomicidioPena pena = new DetentoHomicidioPena();
        String expectedPena = "Pena do detento de homicidio";
        assertEquals(expectedPena, pena.getPena());
    }
}