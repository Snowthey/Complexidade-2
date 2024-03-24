import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
public class FatorialTest {

    @Test
    void teste1(){
        Fatorial objeto = new Fatorial();

        int retorno1 = objeto.FatorialIterativo(0);
        int retorno2 = objeto.FatorialRecursivo(0);
        assertEquals(1, retorno1, retorno2);
    }

    @Test
    void teste2(){
        Fatorial objeto = new Fatorial();

        int retorno1 = objeto.FatorialIterativo(1);
        int retorno2 = objeto.FatorialRecursivo(1);
        assertEquals(1, retorno1, retorno2);
    }

    @Test
    void teste3(){
        Fatorial objeto = new Fatorial();

        int retorno1 = objeto.FatorialIterativo(2);
        int retorno2 = objeto.FatorialRecursivo(2);
        assertEquals(2, retorno1, retorno2);
    }
}
