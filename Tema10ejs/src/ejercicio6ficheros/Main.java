package ejercicio6ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        // Leer los números del archivo y almacenarlos en la lista
        try (BufferedReader br = new BufferedReader(new FileReader("src\\ejercicio6ficheros\\asciendenumeros"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                numeros.add(numero);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        //Ordena la lista de números de forma ascendente
        Collections.sort(numeros);

        // Guardar los números ordenados en otro archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio6ficheros\\asciendenumeros"))) {
            for (int numero : numeros) {
                bw.write(Integer.toString(numero));
                bw.newLine();
                
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
        System.out.println("Números ordenados guardados en el archivo " + );
    }

}
