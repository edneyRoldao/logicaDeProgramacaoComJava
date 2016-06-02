package tutorialLoiane.vetores.util;

/**
 * Essa classe utiliza o classe StringBuilder para exibir todos os elementos do vetor.
 * @author Edney Roldao
 *
 */
public class VetorExemploToStringComStringBuilder {
	
	/**
	 * Esse metodo vai substituir o nosso toString.
	 * 
	 * @param vetor
	 * @return retorna uma string com todos os elementos do vetor
	 */
	public static String toString(String[] vetor, int controleTamanhoVetor) {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < controleTamanhoVetor - 1; i++) {
			s.append(vetor[i]);
			s.append(", ");
		}
		
		if(controleTamanhoVetor > 0) {
			s.append(vetor[controleTamanhoVetor - 1]);
		}
		
		s.append("]");
		
		return s.toString();
	}

}
