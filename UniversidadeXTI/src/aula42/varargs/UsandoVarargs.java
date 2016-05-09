package aula42.varargs;

/**
 * @author Edney Roldao
 * 
 * Varargs � a forma que temos para passar uma quantidade indefinida de par�metros. 
 * 
 * � exatamente o que acontece no m�todo main com uma diferen�a na sintaxe.
 * 
 * Varargs recebe um array de argumentos, por�m n�o precisam estar em um array.
 * 
 * IMPORTANTE: O par�metros varargs sempre deve ser o �ltimo a ser declarado, caso exista outros par�metros no m�todo 
 *
 */
public class UsandoVarargs {
	
	public static void main(String[] args) {
		
		// Usando o m�todo com varargs
		somarComVarargs(2, 5, 7, 9, 15, 45);
		
		// Usando o m�todo sem varargs
		int[] numeros = {2, 5, 7, 9, 15, 45};
		somarSemVarargs(numeros);
		
	}
	
	
	// COM VARARGS
	public static void somarComVarargs(int ... numeros) {
		int total = 0;
	
		for(int v : numeros) {
			total += v;
		}
		
		System.out.println("Com varargs: " + total);
	}
	
	
	// SEM VARARGS
	public static void somarSemVarargs(int[] numeros) {
		int total = 0;
	
		for(int v : numeros) {
			total += v;
		}
		
		System.out.println("Sem varargs: " + total);
	}
	
	
	
}
