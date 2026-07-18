package Ejercicios;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            suma = suma + numero;
        }

        promedio = suma / 10.0;

        System.out.println("RESULTADOS");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}

