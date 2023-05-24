package ejercicio4ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="";
		
		
		
		Scanner sc= new Scanner (System.in);
		
		BufferedWriter bw=null;
		
			try {
				bw = new BufferedWriter(new FileWriter("src\\ejercicio4ficheros\\Lectura"));
				while(!nombre.equals("")) {
					nombre=sc.next();
					//si lo escrito no es "fin", entonces se añade al fichero
					if(!nombre.equals("fin")){
						//introduce dentro del fichero lo que escribes
						bw.write(nombre+" ");
						//introduce los caracteres que hayas escrito en el texto
						bw.newLine();
						bw.flush();
					}
					
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		
	}

}
