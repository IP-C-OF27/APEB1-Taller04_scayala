import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes..."
 * @author Sofia Ayala
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costomin, mincons, totalplanilla;
        System.out.println(" Ingresar el numero de minutos consumidos ");
        costomin = tcl.nextDouble();
        System.out.println(" Ingrese el costo por minuto: ");
        mincons = tcl.nextDouble();
        totalplanilla = (costomin * mincons);
        System.out.println(" El valor a cancelar de la planilla es: " + totalplanilla);
    }
}
/*** EVIDENCIA DEL RUN
 * run:
 Ingresar el numero de minutos consumidos 

44
 Ingrese el costo por minuto: 

7
 El valor a cancelar de la planilla es: 308.0
BUILD SUCCESSFUL (total time: 22 seconds)
 */