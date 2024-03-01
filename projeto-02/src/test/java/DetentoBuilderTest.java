import org.example.Detento;
import org.example.DetentoBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetentoBuilderTest {

    @Test
    void excecaoBlocoInvalido() {
        try {
            DetentoBuilder detentoBuilder = new DetentoBuilder();
            Detento detento = detentoBuilder
                    .setBloco("")
                    .setCrime("Furto")
                    .setPena("2 anos")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Bloco de celas inválido", e.getMessage());
        }
    }

    @Test
    void excecaoCrimeInvalido() {
        try {
            DetentoBuilder detentoBuilder = new DetentoBuilder();
            Detento detento = detentoBuilder
                    .setBloco("1")
                    .setCrime("")
                    .setPena("2 anos")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Crime inválido", e.getMessage());
        }
    }

    @Test
    void excecaoPenaInvalida() {
        try {
            DetentoBuilder detentoBuilder = new DetentoBuilder();
            Detento detento = detentoBuilder
                    .setBloco("1")
                    .setCrime("Furto")
                    .setPena("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pena inválida", e.getMessage());
        }
    }

    @Test
    void retornaDetentoValido() {
        DetentoBuilder detentoBuilder = new DetentoBuilder();
        Detento detento = detentoBuilder
                .setBloco("1")
                .setCrime("Furto")
                .setPena("2 anos")
                .build();
        assertNotNull(detento);
    }
}