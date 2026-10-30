import java.util.Scanner;
/**
 Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Sofia Ayala
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double pagomes, interesmes, monto;
        System.out.println("Ingresar el monto del prestamo: ");
        monto = tcl.nextDouble();
        System.out.println("Ingresar el interes mensual del prestamo: ");
        interesmes = tcl.nextDouble();
        pagomes = (monto/12) + (monto * interesmes / 100);
        System.out.println("El pago mensual es: " + pagomes);
    }
}
/*** EVIDENCIA DEL RUN
run:
Ingresar el monto del prestamo: 
1200
Ingresar el interes mensual del prestamo: 
5
El pago mensual es: 160.0
BUILD SUCCESSFUL (total time: 23 seconds)
 */
