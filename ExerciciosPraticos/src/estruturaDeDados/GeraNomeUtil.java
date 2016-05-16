package estruturaDeDados;

import java.util.Random;

/**
 * @author Edney Roldao
 * 
 * 	Classe auxiliar para gerar nomes randomicos com 5 caracteres
 */
public class GeraNomeUtil {
	
	public static String getGeraNomesAleatorios() {
		
		final String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random r = new Random();
		StringBuilder formaNome = new StringBuilder();
		
		for(int i = 0; i < 5; i++) {
			int aleatorio = r.nextInt(letras.length());
			formaNome.append(letras.charAt(aleatorio));
		}
			
		return formaNome.toString();
	}

}
