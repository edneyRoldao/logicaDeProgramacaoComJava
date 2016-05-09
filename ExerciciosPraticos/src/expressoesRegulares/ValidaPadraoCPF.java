package expressoesRegulares;

public class ValidaPadraoCPF {
	
	public static void main(String[] args) {
		System.out.println(validarCPF("151-245-369-87"));
	}
	
	public static boolean validarCPF(String cpf) {
		String regExp = "\\d{3}-?\\d{3}-?\\d{3}-?\\d{2}";
		return cpf.matches(regExp) ? true : false;
	}

}
