package Ejercicios;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contrasena;
        String contrasenaCorrecta = "java2026";
        boolean accesoCorrecto = false;

        do {
            System.out.print("Ingrese la contraseña: ");
            contrasena = sc.nextLine();

            if (contrasena.equals(contrasenaCorrecta)) {
                accesoCorrecto = true;
            } else {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }

        } while (accesoCorrecto == false);

        System.out.println("Acceso concedido.");

        sc.close();
    }
}
