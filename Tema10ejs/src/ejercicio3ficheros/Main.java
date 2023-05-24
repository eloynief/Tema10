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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
