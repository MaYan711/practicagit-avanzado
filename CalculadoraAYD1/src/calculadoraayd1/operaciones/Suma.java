/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraayd1.operaciones;

/**
 * @author rony
 */
public class Suma implements Operacion {

    @Override
    public double calcular(double num1, double num2) throws ArithmeticException {
        return num1 + num2;
    }

    @Override
    public String getNombre() {
        return "Suma";
    }

    @Override
    public String getSimbolo() {
        return "+";
    }
}