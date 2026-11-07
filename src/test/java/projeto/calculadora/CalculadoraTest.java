package projeto.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("CT01 - Soma de dois inteiros positivos")
    void deveSomarDoisInteirosPositivos() {
        Assertions.assertEquals(3, calculadora.soma(1, 2));
    }

    @Test
    @DisplayName("CT02 - Subtração de dois inteiros")
    void deveSubtrairDoisInteiros() {
        Assertions.assertEquals(1, calculadora.sub(2, 1));
    }

    @Test
    @DisplayName("CT03 - Multiplicação de dois inteiros")
    void deveMultiplicarDoisInteiros() {
        Assertions.assertEquals(28, calculadora.mult(4, 7));
    }

    @Test
    @DisplayName("CT04 - Divisão com resultado exato")
    void deveDividirComResultadoExato() {
        Assertions.assertEquals(4.0, calculadora.divisao(12.0, 3.0), 0.0001);
    }

    @Test
    @DisplayName("CT05 - Divisão por zero")
    void deveLancarExcecaoAoDividirPorZero() {
        ArithmeticException erro = Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculadora.divisao(12.0, 0.0)
        );
        Assertions.assertEquals("Divisão por zero não permitida", erro.getMessage());
    }

    @Test
    @DisplayName("CT11 - Soma de números negativos")
    void deveSomarNumerosNegativos() {
        Assertions.assertEquals(-8, calculadora.soma(-5, -3));
    }

    @Test
    @DisplayName("CT12 - Multiplicação por zero")
    void deveMultiplicarPorZero() {
        Assertions.assertEquals(0, calculadora.mult(10, 0));
    }

    @Test
    @DisplayName("CT13 - Divisão com resultado decimal")
    void deveDividirComResultadoDecimal() {
        Assertions.assertEquals(2.5, calculadora.divisao(10.0, 4.0), 0.0001);
    }
}
