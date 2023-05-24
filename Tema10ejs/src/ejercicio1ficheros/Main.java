package ejercicio1ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {


	    public static void main(String[] args) {
	        String archivo = "NumerosReales.txt";

	        double suma = 0.0;
	        int contador = 0;

	        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] numeros = linea.split(" ");
	                for (String numero : numeros) {
	                    double valor = Double.parseDouble(numero);
	                    suma += valor;
	                    contador++;
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error al leer el archivo: " + e.getMessage());
	            return;
	        }

	        if (contador > 0) {
	            double media = suma / contador;
	            System.out.println("Suma: " + suma);
	            System.out.println("Media: " + media);
	        } else {
	            System.out.println("No se encontraron números en el archivo.");
	        }
	    }
	


}
