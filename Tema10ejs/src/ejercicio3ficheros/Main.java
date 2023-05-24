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

		Scanner sc= new Scanner (System.in);
		
		BufferedWriter bw=null;
		
		
		try {
			//sirve para poder escribir en el txt
			bw = new BufferedWriter(new FileWriter("src\\ejercicio8\\ej8"));
			//sirve para recoger de readline
			
			String linea="";
			String lineas[]= {};
			
			//readline te salta a la siguiente linea
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//colocar datos
		nombre=sc.next();
		edad=sc.nextInt();
		altura=sc.nextDouble();
		
		
		
		
		
	}
}
