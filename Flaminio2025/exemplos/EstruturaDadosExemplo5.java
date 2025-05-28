package exemplos;

import java.util.HashMap;

public class EstruturaDadosExemplo5 {
	
	public static void main(String[]args) {
		
		HashMap<String, String> cidadePais = new HashMap<String, String>();
		
		cidadePais.put("São Paulo", "Brasil");
		cidadePais.put("Bahia", "Brasil");
		cidadePais.put("Fortaleza", "Brasil");
		cidadePais.put("Belo Horizonte", "Brasil");
		cidadePais.put("Curitiba", "Brasil");
		
		System.out.println(cidadePais);

	}
	

}
