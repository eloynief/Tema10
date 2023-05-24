package ej1ficheros;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un valor double: ");
        double doubleValue = Utils.readDouble(scanner);
        System.out.println("Valor double: " + doubleValue);

        System.out.print("Introduce un valor int: ");
        int intValue = Utils.readInt(scanner);
        System.out.println("Valor int: " + intValue);

        scanner.close();
    }
}
