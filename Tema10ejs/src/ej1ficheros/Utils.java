package ej1ficheros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static double readDouble(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El valor introducido no es de tipo double");
            return 0.0;
        }
    }

    public static int readInt(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El valor introducido no es de tipo int");
            return 0;
        }
    }
}
