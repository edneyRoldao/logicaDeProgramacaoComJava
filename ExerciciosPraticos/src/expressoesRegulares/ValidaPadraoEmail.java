package expressoesRegulares;

/**
 * 
 * Exemplos de expressoes regulares para validacao de e-mails
 * 
 * @author edneyroldao
 *
 */
public class ValidaPadraoEmail {
	
	public static void main(String[] args) {
		
		System.out.println(validarEmail("edney@yahoo.com"));

		System.out.println(validarEmailComBR("edney@test.com"));
		System.out.println(validarEmailComBR("edney@test.com.br"));
		System.out.println(validarEmailComBR("edney@test.combr"));
		
	}
	
	public static boolean validarEmail(String email) {
		
		String regex = "\\w+@\\w+\\.[\\w&&[^0-9]]{2,3}";
		
		return email.matches(regex) ? true : false;
	}
	
	public static boolean validarEmailComBR(String email) {
		
		String regExp = "[^0-9][a-zA-Z_0-9]{3,}@[^0-9][a-zA-Z_0-9]{3,}.com(.br)?";
		
		return email.matches(regExp) ? true : false;
	}

}
