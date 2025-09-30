import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OperacoesTest {

    @Test
    public void testSomar() {
        assertEquals(5.0, Operacoes.somar(2, 3));
        assertEquals(-1.0, Operacoes.somar(2, -3));
        assertEquals(0.0, Operacoes.somar(0, 0));
    }
}
