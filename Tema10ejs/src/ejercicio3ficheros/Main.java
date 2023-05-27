package ejercicio3ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	 public static void main(String[] args) {
		//
		int totalAlumnos = 0;
		int sumaEdades = 0;
		double sumaEstaturas = 0.0;
	
		try (BufferedReader br = new BufferedReader(new FileReader("src\\ejercicio3ficheros\\Alumnos"))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] datos = linea.split(" ");
	                if (datos.length >= 3) {
	                    String nombre = datos[0];
	                    int edad = Integer.parseInt(datos[1]);
	                    double estatura = Double.parseDouble(datos[2]);

	                    System.out.println("Nombre: " + nombre);
	                    sumaEdades += edad;
	                    sumaEstaturas += estatura;
	                    totalAlumnos++;
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error al leer el archivo: " + e.getMessage());
	        }

	        if (totalAlumnos > 0) {
	            double mediaEdades = (double) sumaEdades / totalAlumnos;
	            double mediaEstaturas = sumaEstaturas / totalAlumnos;

	            System.out.println("Media de Edades: " + mediaEdades);
	            System.out.println("Media de Estaturas: " + mediaEstaturas);
	        } else {
	            System.out.println("No se encontraron datos de alumnos en el archivo.");
	        }
	    }
}
