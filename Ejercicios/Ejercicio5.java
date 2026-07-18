package Ejercicios;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calificacion;

        System.out.print("Ingrese una calificación entre 0 y 10: ");
        calificacion = sc.nextDouble();

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificación no válida.");

        } else if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Excelente");

        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Muy Bueno");

        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Bueno");

        } else if (calificacion >= 5 && calificacion < 7) {
            System.out.println("Regular");

        } else if (calificacion >= 0 && calificacion < 5) {
            System.out.println("Deficiente");
        }

        sc.close();
    }
}

