package calculadoraayd1.operaciones;

public class Resta implements Operacion {

    // Implementación del método calcular para la operación de resta
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }

    // Implementación del método getNombre para obtener el nombre de la operación
    @Override
    public String getNombre() {
        return "Resta";
    }

    // Implementación del método getSimbolo para obtener el símbolo de la operación
    @Override
    public String getSimbolo() {
        return "-";
    }
    
}
