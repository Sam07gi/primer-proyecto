package Ejercicios;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
 import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero;
        double mayor;
        double menor;

        System.out.print("Ingrese el número 1: ");
        numero = sc.nextDouble();

        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextDouble();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("RESULTADOS");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        sc.close();
    }
}
