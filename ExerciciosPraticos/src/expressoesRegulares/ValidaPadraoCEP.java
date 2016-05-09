package expressoesRegulares;

public class ValidaPadraoCEP {
	
	public static void main(String[] args) {
		System.out.println(validarCEP("23043-000"));
		System.out.println(validarCEP("23043000"));
		System.out.println(validarCEP("23043--000"));
	}
	
	public static boolean validarCEP(String cep) {
		String regExp = "\\d{5}-?\\d{3}";

		return cep.matches(regExp) ? true : false;
	}

}
