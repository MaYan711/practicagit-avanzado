package calculadoraayd1.operaciones;

/**
 * @author kenny
 */
public class Multiplicacion implements Operacion {

    @Override
    public double calcular(double num1, double num2) throws ArithmeticException {
        return num1 * num2;
    }

    @Override
    public String getNombre() {
        return "Multiplicacion";
    }

    @Override
    public String getSimbolo() {
        return "*";
    }
}