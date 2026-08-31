/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraayd1.util;

import java.util.Scanner;

/**
 * clase de utilidad para validacion de entrada de usuario
 * 
 * @author rony
 */
public class ValidadorEntrada {

    /**
     * obtiene un numero del usuario con validaciun
     * 
     * @param scanner Scanner para entrada
     * @param mensaje Mensaje a mostrar al usuario
     * @return Número ingresado por el usuario
     */
    public static double obtenerNumero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Entrada invalida. Por favor ingrese un numero valido.");
                scanner.nextLine();
            }
        }
    }

    /**
     * obtiene una opcion de menu valida dentro de un rango
     * 
     * @param min valor minimo permitido
     * @param max valor maximo permitido
     * @return opcion seleccionada por el usuario
     */
    public static int obtenerOpcionValida(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int opcion = scanner.nextInt();
                if (opcion >= min && opcion <= max) {
                    return opcion;
                }
                System.out.println("Opcion invalida. Seleccione entre " + min + " y " + max);
            } catch (Exception e) {
                System.out.println("Entrada invalida. Por favor ingrese un numero.");
                scanner.nextLine();
            }
        }
    }
}