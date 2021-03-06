package operadoresIncrementais;

/**
 * 
 * @author edney.souza
 * 
 * - Dispensa comentarios.
 *  - aula 26 - eXcript
 * - Link do video: https://www.youtube.com/watch?v=e5ld4wdIIJg&index=27&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
 *
 */
public class OperadoresIncremento {
	
	public static void main(String[] args) {
		
		System.out.println("Imcrementando");
		System.out.println("------------------------");
		//Operadores de incremento
		int i = 0;
		int y = 0;
		
		 // ++i - Operador de pre-imcremento, aqui o incremento ocorre antes da instrucao 
		System.out.println("Incrementa antes: " + ++i);// neste caso o resultado e 1
		
		// y++ - Operador de pos-imcremento, aqui o incremento ocorre depois da instrucao 
		System.out.println("Incrementa depois: " + y++); // neste caso o resultado e 0
		

		System.out.println("");
		System.out.println("");

		System.out.println("Decrementando");
		System.out.println("------------------------");
		//Operadores de decremento
		int a = 0;
		int b = 0;
		
		 // ++i - Operador de pre-imcremento, aqui o incremento ocorre antes da instrucao 
		System.out.println("decrementa antes: " + --a);// neste caso o resultado e 1
		
		// y++ - Operador de pos-imcremento, aqui o incremento ocorre depois da instrucao 
		System.out.println("decrementa depois: " + b--); // neste caso o resultado e 0

		
		
		//Definicao
		int u = 0;
		
		u = u + 1; //forma tradicinal
		u += 1; //Utilizando operador de atribuicao
		u++;// Utilizando operador de incremento/decremento
		
	}

}
