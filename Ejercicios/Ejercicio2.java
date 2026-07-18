package Ejercicios;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese el primer número entero: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        numero2 = sc.nextInt();

        System.out.println("RESULTADOS");
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));

        if (numero2 != 0) {
            System.out.println("División: " + ((double) numero1 / numero2));
            System.out.println("Residuo: " + (numero1 % numero2));
        } else {
            System.out.println("No se puede realizar la división entre cero.");
            System.out.println("No se puede calcular el residuo entre cero.");
        }

        sc.close();
    }
}
