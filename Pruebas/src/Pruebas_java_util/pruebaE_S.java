package Pruebas_java_util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pruebaE_S {
	
	public static void main(String[] args) throws IOException {
		String ciudad="castellón";
		String extension=".txt";
		String fichero=ciudad+extension;
		System.out.println(fichero);
		String ruta = "Castellón.txt";
		leerFichero(ruta);
	}
	
	public static void escribirFichero(String ruta) throws IOException {
			
		File archivo = new File(ruta);
		BufferedWriter bw;
		System.out.println("****************");
		 
		bw = new BufferedWriter(new FileWriter(archivo));
		bw.write("El fichero de texto ya estaba creado.");
		bw.newLine();
		bw.write("El fichero de texto ya estaba creado.");
		bw.close();
	}
	
	public static void leerFichero(String ruta) throws FileNotFoundException, IOException {
		String cadena;
		String[] tiempo = null;
		FileReader f = new FileReader(ruta);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
            tiempo=cadena.split("::");
        }
        b.close();
        
        for(String t : tiempo) {
        	System.out.println(t+"\n");
        }
	}
}


