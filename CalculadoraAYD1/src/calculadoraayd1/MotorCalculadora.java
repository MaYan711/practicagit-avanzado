/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraayd1;
import calculadoraayd1.operaciones.Multiplicacion;
import calculadoraayd1.operaciones.Operacion;
import calculadoraayd1.util.ValidadorEntrada;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rony
 */
public class MotorCalculadora {

    private final Scanner scanner;
    private final Map<Integer, Operacion> operaciones;
    private boolean ejecutando;

    public MotorCalculadora() {
        this.scanner = new Scanner(System.in);
        this.operaciones = new HashMap<>();
        this.ejecutando = true;
        registrarOperaciones();
    }

    /**
     * registra todas las operaciones disponibles
     */
    private void registrarOperaciones() {
        //operaciones.put(1, new Suma());
        operaciones.put(3, new Multiplicacion());

    }

    /**
     * ciclo de ejecucion
     */
    public void iniciar() {

        while (ejecutando) {
            try {
                mostrarMenu();
                int opcion = ValidadorEntrada.obtenerOpcionValida(scanner, 1, 5);
                procesarOpcion(opcion);
            } catch (Exception e) {
                System.out.println("error inesperado: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
        System.out.println("Chao");
    }

    /**
     * pprocesa la opcion seleccionada por el usuario
     */
    private void procesarOpcion(int opcion) {
        if (opcion == 5) {
            ejecutando = false;
            return;
        }

        Operacion operacion = operaciones.get(opcion);
        if (operacion != null) {
            ejecutarOperacion(operacion);
        } else {
            System.out.println("Operación no implementada aún");
            System.out.println("Próximamente disponible...");
        }

        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * ejecuta una operación especifica
     */
    private void ejecutarOperacion(Operacion operacion) {
        try {
            System.out.println("\n--- " + operacion.getNombre().toUpperCase() + " ---");
            double num1 = ValidadorEntrada.obtenerNumero(scanner, "Ingrese el primer número: ");
            double num2 = ValidadorEntrada.obtenerNumero(scanner, "Ingrese el segundo número: ");

            double resultado = operacion.calcular(num1, num2);

            System.out.println("\nRESULTADO");
            System.out.println(num1 + " " + operacion.getSimbolo() + " " + num2 + " = " + resultado);
            System.out.println("operación completada exitosamente");

        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al ejecutar la operación: " + e.getMessage());
            scanner.nextLine();
        }
    }

    /**
     * muestra el menu principal
     */
    private void mostrarMenu() {
        System.out.println("********CALCULADORA AYD1********");
        //System.out.println("1. Suma");
        System.out.println("3. Multiplicacion");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");

    }

}