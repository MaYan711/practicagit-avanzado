package calculadoraayd1.operaciones;

/**
 * Implementa la operacion de division.
 *
 * @author mario
 */
public class Division implements Operacion {

    @Override
    public double calcular(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        return num1 / num2;
    }

    @Override
    public String getNombre() {
        return "Division";
    }

    @Override
    public String getSimbolo() {
        return "/";
    }
}
