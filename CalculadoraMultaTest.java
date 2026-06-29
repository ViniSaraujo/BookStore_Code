package service;

import org.junit.Assert;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraMultaTest {

    @Test
    public void testCalcularMultaSemAtraso() {
        CalculadoraMulta calc = new CalculadoraMulta();
        double resultado = calc.calcularValorMulta(0);
        // Espera-se que a multa seja 0.0
        Assert.assertEquals(0.0, resultado, 0.001);
    }

    @Test
    public void testCalcularMultaComAtraso() {
        CalculadoraMulta calc = new CalculadoraMulta();
        // 5 dias de atraso * R$ 2,00 = R$ 10,00
        double resultado = calc.calcularValorMulta(5);
        Assert.assertEquals(10.0, resultado, 0.001);
    }
}