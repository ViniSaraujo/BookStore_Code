package service;

public class CalculadoraMulta {
    
    // Regra: R$ 2.00 por dia de atraso. Se não houver atraso, a multa é 0.
    public double calcularValorMulta(int diasAtraso) {
        if (diasAtraso <= 0) {
            return 0.0;
        }
        return diasAtraso * 2.0;
    }
}