import java.util.Scanner;
/**
 Ejercicio 07: "Generar un algoritmo que 
 * permita calcular y mostrar el valor a cancelar de una planilla de luz. 
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de 
 * kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, 
 * se debe descontar el 10%."
 * @author Sofia Ayala
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costok_h, consumomes, edadusuario, totalmes;
        System.out.println("Ingresar edad de usuario: ");
        edadusuario = tcl.nextDouble();
        System.out.println("Ingresar el costo por Kilovatio/hora: ");
        costok_h = tcl.nextDouble();
        System.out.println("Ingresar el total consumido: ");
        consumomes = tcl.nextDouble();
        if (edadusuario >= 65) {
            totalmes = (costok_h * consumomes);
            totalmes = totalmes - (totalmes * 0.10);
            System.out.println("El total con el descuento es: " + totalmes);}
        else {
            totalmes = (costok_h* consumomes);
            System.out.println("El valor a cancelar de la planilla es: " + totalmes);   } 
    }
}
/*** EVIDENCIA DEL RUN
 run:
Ingresar edad de usuario: 
69
Ingresar el costo por Kilovatio/hora: 
50
Ingresar el total consumido: 
50
El total con el descuento es: 2250.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */
