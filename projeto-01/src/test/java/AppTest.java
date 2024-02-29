import org.example.App;
import org.example.Cadeia;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        App.main(new String[]{});

        String expectedOutput = "Detento preso por furto\n" +
                "Bloco detento furto\n" +
                "Pena do detento de furto\n" +
                "Detento preso por homicidio\n" +
                "Bloco do detento de homicidio\n" +
                "Pena do detento de homicidio\n";
        String actualOutput = outputStreamCaptor.toString().replaceAll("\\s+", "");

        assertEquals(expectedOutput.replaceAll("\\s+", ""), actualOutput);
    }

    @Test
    void testRun() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        App app = new App();
        app.run();

        String expectedOutput = "Detento preso por furto\n" +
                "Bloco detento furto\n" +
                "Pena do detento de furto\n" +
                "Detento preso por homicidio\n" +
                "Bloco do detento de homicidio\n" +
                "Pena do detento de homicidio\n";
        String actualOutput = outputStreamCaptor.toString().replaceAll("\\s+", "");

        assertEquals(expectedOutput.replaceAll("\\s+", ""), actualOutput);
    }

    @Test
    void testCriarCadeia() {
        App app = new App();

        app.criarCadeia(Cadeia.FactoryMaker.DetentoType.FURTO);

        assertNotNull(app.cadeia.getBloco());
        assertNotNull(app.cadeia.getPena());

        app.criarCadeia(Cadeia.FactoryMaker.DetentoType.HOMICIDIO);

        assertNotNull(app.cadeia.getBloco());
        assertNotNull(app.cadeia.getPena());
    }
}
