import br.com.taocode.planetasAPI.Calculadora;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testarSoma() {
        Calculadora calculadora = new Calculadora();

        assertThat(calculadora.somar(2, 3)).isEqualTo(5);
    }
}
