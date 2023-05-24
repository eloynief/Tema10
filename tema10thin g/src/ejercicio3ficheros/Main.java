package ejercicio3ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		String nombre;
		int edad;
		double altura;

		double mediaEdad;
		double mediaAltura;
		
		
		Scanner sc= new Scanner (System.in);
		
		BufferedWriter bw=null;
		
		
		try {
			//sirve para poder escribir en el txt
			//no me funciona cuando pongo .txt después del archivo, así que lo pongo sin escribir .txt
			bw = new BufferedWriter(new FileWriter("src\\ejercicio3ficheros\\Alumnos"));
			//sirve para recoger de readline
			
		/*	String linea="";
			//guarda lo que escribas en el
			//dentro del array, están los elementos que queremos añadir al texto
			String lineas[]= {"","","","",""};*/
			
			
			
			System.out.println("Escribe el nombre: ");
			//colocar datos
			nombre=sc.next();
			System.out.println("Escribe la edad: ");
			edad=sc.nextInt();
			System.out.println("Escribe la altura: ");
			altura=sc.nextDouble();
			
			//introduce dentro del fichero lo que escribes
			bw.write(nombre + ", " + edad + ", " + altura);
			//introduce los caracteres que hayas escrito en el texto
			bw.newLine();
			bw.flush();
			
			//readline te salta a la siguiente linea
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
