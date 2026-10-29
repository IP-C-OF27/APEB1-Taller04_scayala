
import java.util.Scanner;

/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Sofia Ayala
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gastoHijo1, gastoHijo2, gastoHijo3, gastoTotal;
        System.out.print("Deme gastos: ");
        gastoHijo1 = tcl.nextDouble();
        gastoHijo2 = tcl.nextDouble();
        gastoHijo3 = tcl.nextDouble();
        gastoTotal = (gastoHijo1 + gastoHijo2 + gastoHijo3);
        System.out.println("Total gastos: " + gastoTotal ); 
    }   
}
/***
 * EVIDENCIA DEL RUN:
 run:
Deme gastos: 45
5465
45
Total gastos: 5555.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */