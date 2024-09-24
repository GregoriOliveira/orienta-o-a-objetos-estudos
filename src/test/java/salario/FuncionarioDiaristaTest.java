package salario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioDiaristaTest {

    @Test
    void deveCalcularSalario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setValorDia(1000.0f);
        funcionarioDiarista.setNumDias(25);
        assertEquals(25000.0f, funcionarioDiarista.calcularSalario());
    }


}