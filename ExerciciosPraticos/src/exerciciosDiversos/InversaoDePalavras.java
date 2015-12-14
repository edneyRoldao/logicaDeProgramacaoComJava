package exerciciosDiversos;

/**
 * 
 * @author edneyroldao
 *
 *Vomos implementar métodos que invertem a ordem das palavras, de tras para frente e vice-versa
 *
 */
public class InversaoDePalavras {
	
	public static void main(String[] args) {
		desinverterPalavra("nadine");
	}
	
	
	public static void desinverterPalavra(String palavraInvertida) {
		
		String nome = "";
		
		for(int i = palavraInvertida.length() -1; i >= 0; i--) {
			char letra = palavraInvertida.charAt(i);
			nome += letra;
		}
		System.out.println("Palavra: " + nome);
	}
	

}