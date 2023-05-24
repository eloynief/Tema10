package ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=1;
		//fecha
		String fecha;
		//temperaturas
		double tempmin,tempmax;
		
		
		
		Scanner sc= new Scanner (System.in);
		
		//escribe en el texto cuando se usa
		BufferedWriter bw=null;
		
		BufferedReader br=null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src\\ejercicio8\\ej8",true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		do {
			menu();
			opcion=sc.nextInt();
			sc.nextLine();
			//casos de ter
			switch(opcion) {
				case 1:{ //registra temperatura
					System.out.println("introduzca la fecha");
					fecha=sc.nextLine();
					System.out.println("Introduzca la temp minima: ");
					tempmin =sc.nextDouble();
					System.out.println("introduzca la temp maxima: ");
					tempmax=sc.nextDouble();
					
					
					try {
						bw.write(fecha+", "+tempmax+", "+tempmin);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						bw.newLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						bw.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				}
				case 2:{
					
					try {
						//sirve para leer la linea
						br = new BufferedReader(new FileReader("src\\ejercicio8\\ej8"));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//historial de lo escrito
					String linea=br.readLine();
					while(linea!=null) {
						//lo que está antes y despues de la coma y el espacio, se separa en posiciones de array
						datos=linea.split(", ");
					}
					
					break;
				}
			}
			
			
		}while (opcion!=3);
	}
	
	//metodo static
	public static void menu() {
		
	}

}
