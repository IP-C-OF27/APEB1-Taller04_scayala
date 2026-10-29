
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área
 * de un triángulo. Los datos deben ser pedidos al usuario"
 * @author Sofia Ayala
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.println(" Ingresar base:");
        base = tcl.nextDouble();
        System.out.println(" Ingresar altura");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area:" + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 Ingresar base:
7
 Ingresar altura
5
Area:17.5
BUILD SUCCESSFUL (total time: 7 seconds)
 */
 