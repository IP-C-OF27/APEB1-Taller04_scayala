import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón...."
 * @author Sofia Ayala
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costcompu, costcpu, costeclado, costpantalla, costraton;
        System.out.print("Ingresar el costo del CPU: ");
        costcpu = tcl.nextDouble();
        System.out.print("Ingresar el costo del teclado: ");
        costeclado = tcl.nextDouble();
        System.out.print("Ingresar el costo de pantalla: ");
        costpantalla = tcl.nextDouble();
        System.out.print("Ingresar el costo del raton: ");
        costraton = tcl.nextDouble();
        costcompu = (costcpu + costeclado + costpantalla + costraton);
        System.out.println("El costo de la computadora es: " + costcompu);   
    }
}
/*** EVIDENCIA DEL RUN
 * run:
 Ingresar el costo del CPU: 200
Ingresar el costo del teclado: 28
Ingresar el costo de pantalla: 180
Ingresar el costo del raton: 30
El costo de la computadora es: 438.0
BUILD SUCCESSFUL (total time: 17 seconds)
 */
