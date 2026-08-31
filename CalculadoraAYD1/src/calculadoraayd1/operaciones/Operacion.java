/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculadoraayd1.operaciones;

/**
 * interfaz que define el contrato para todas las operaciones de la calculadora
 * 
 * @author rony
 */
public interface Operacion {

    /**
     * realiza el calculo de la operacion
     * 
     * @param num1 Primer numero
     * @param num2 Segundo numero
     * @return Resultado de la operacion
     * @throws ArithmeticException Si ocurre un error matematico (ej: division por
     *                             cero)
     */
    double calcular(double num1, double num2) throws ArithmeticException;

    /**
     * Obtiene el nombre de la operacion
     * 
     * @return Nombre descriptivo de la operacion
     */
    String getNombre();

    /**
     * Obtiene el simbolo de la operacion
     * 
     * @return Simbolo de la operacion (+, -, *, /)
     */
    String getSimbolo();
}