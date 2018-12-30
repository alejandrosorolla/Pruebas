package Pruebas_java_util;

import java.util.HashMap;
import java.util.Map;

public class Listas {

	public static void main(String[] args) {
		Map<Integer, String> datos = new HashMap<Integer, String>();
		datos.put(1, "uno");
		datos.put(2, "dos");
		datos.put(3, "tres");
		
		System.out.println(datos);

		
		for (Map.Entry<Integer, String> entry : datos.entrySet()) {
		    System.out.println(entry.getValue());
		}
	}

}
