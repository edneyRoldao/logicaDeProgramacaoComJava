package ExpressoesRegulares;

/**
 * 
 * Exemplos de expressoes regulares para validacao de e-mails
 * 
 * @author edneyroldao
 *
 */
public class PadraoEmail {
	
	public static void main(String[] args) {
		
		System.out.println(isValidEmail("edney@yahoo.combr"));
		
	}
	
	public static boolean isValidEmail(String email) {
		
		String regex = "\\w+@\\w+\\.[\\w&&[^0-9]]{2,3}";
		
		return email.matches(regex) ? true : false;
	}

}
