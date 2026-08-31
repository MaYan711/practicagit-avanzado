package calculadoraayd1.operaciones;

public class Resta implements Operacion {

    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public String getNombre() {
        return "Resta";
    }

    @Override
    public String getSimbolo() {
        return "-";
    }
    
}
