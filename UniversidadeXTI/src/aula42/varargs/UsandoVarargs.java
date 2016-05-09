package aula42.varargs;

/**
 * @author Edney Roldao
 * 
 * Varargs é a forma que temos para passar uma quantidade indefinida de parâmetros. 
 * 
 * É exatamente o que acontece no método main com uma diferença na sintaxe.
 * 
 * Varargs recebe um array de argumentos, porém não precisam estar em um array.
 * 
 * IMPORTANTE: O parâmetros varargs sempre deve ser o último a ser declarado, caso exista outros parâmetros no método 
 *
 */
public class UsandoVarargs {
	
	public static void main(String[] args) {
		
		// Usando o método com varargs
		somarComVarargs(2, 5, 7, 9, 15, 45);
		
		// Usando o método sem varargs
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
