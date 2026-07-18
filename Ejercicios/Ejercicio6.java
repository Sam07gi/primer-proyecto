package Ejercicios;
/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número entre 1 y 7: ");
        numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Número no válido.");
                break;
        }

        sc.close();
    }
}

