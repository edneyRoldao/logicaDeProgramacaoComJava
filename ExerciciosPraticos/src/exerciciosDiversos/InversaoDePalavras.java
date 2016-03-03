package exerciciosDiversos;

import java.util.Scanner;

/**
 * 
 * @author edneyroldao
 *
 *Vamos implementar métodos que invertem a ordem das palavras, de tras para frente e vice-versa
 *
 */
public class InversaoDePalavras {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Informa a palavra:");
		String nome = sc.nextLine();

		desinverterPalavra(nome);
	}
	
	//Este mesmo método pode ser utilizado para verificar se uma palavrar é um palindromo.
	public static void desinverterPalavra(String palavraInvertida) {
		
		String nome = "";
		
		for(int i = palavraInvertida.length() -1; i >= 0; i--) {
			char letra = palavraInvertida.charAt(i);
			nome = nome +letra;
		}
		System.out.println("Palavra: " + nome);
	}
	

}
