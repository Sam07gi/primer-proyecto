package Ejercicios;
/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = sc.nextInt();

            if (numero > 0) {
                cantidad = cantidad + 1;
                suma = suma + numero;
            }

        } while (numero >= 0);

        System.out.println("RESULTADOS");
        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

        sc.close();
    }
}
