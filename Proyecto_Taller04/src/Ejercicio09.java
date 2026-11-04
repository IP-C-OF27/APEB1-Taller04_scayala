import java.util.Scanner;
/**
 Ejercicio 09: "Desarrolle una solución que determine el estado académico de una
 * persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un 
 * porcentaje de asistencia. La regla institucional establece que:
*La asistencia mínima debe alcanzarse para ser evaluado
*Existe una nota mínima en el examen final, y
*La nota final se calcula combinando evaluación continua y examen final.
*La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar 
*la nota final redondeada a un decimal."
 * @author Sofia Ayala
 * @version 1.0
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        //AQUI AGREGUE TODO SU CODIGO.
        Scanner tcl = new Scanner(System.in);
        double evaluacion, examen, total;
        int asistencia;
        System.out.println("Ingrese su porcentaje de asistencia: ");
        asistencia = tcl.nextInt();
        System.out.println("Ingrese su nota de evaluacion continua: ");
        evaluacion = tcl.nextDouble();
        System.out.println("Ingrese su nota de examen final: ");
        examen = tcl.nextDouble();
        total = (examen + evaluacion ) /2;
        if (asistencia >=80){
            if (examen >= 8 && total >= 8){
                System.out.println("Aprobado");
            } else if (total >= 7){
                        System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }
        } else {
            System.out.println("Reprobado por falta de asistencia");
        }
        System.out.printf("Su nota final es: %.1f%n", total);
        }
    }
    /*** EVIDENCIA DEL RUN
run:
Ingrese su porcentaje de asistencia: 
8
Ingrese su nota de evaluacion continua: 
7
Ingrese su nota de examen final: 
8
Reprobado por falta de asistencia
Su nota final es: 7,5
BUILD SUCCESSFUL (total time: 6 seconds)
 */

