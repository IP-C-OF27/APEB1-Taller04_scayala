import java.util.Scanner;
/**
 Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar el
 * valor total a pagar mensual de servicios digitales de una persona. 
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Sofia Ayala
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double valorservicios, valorN, valorY, valorD, valorS, edadusuario;
        System.out.println("Ingresar edad del usuario: ");
        edadusuario = tcl.nextDouble();
        System.out.println("Ingresar valor a pagar de Netflix: ");
        valorN = tcl.nextDouble();
        System.out.println("Ingresar valor a pagar de Youtube Premium: ");
        valorY = tcl.nextDouble();
        System.out.println("Ingresar el valor a pagar de dropbox: ");
        valorD = tcl.nextDouble();
        System.out.println("Ingresar el valor a pagar de spotify");
        valorS = tcl.nextDouble();
        if (edadusuario <= 30){
            valorservicios = (valorN + valorY + valorD + valorS);
            valorservicios = valorservicios - (valorservicios  * 0.20);
            System.out.println("El valor total a cancelar con el descuento es: " + valorservicios);}
        else {
            valorservicios = (valorN + valorY + valorD + valorS);
            System.out.println("El valor total a cancelar es: " + valorservicios);
        }
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