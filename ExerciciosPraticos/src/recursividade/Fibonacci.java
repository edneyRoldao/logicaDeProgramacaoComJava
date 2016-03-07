package recursividade;

import java.util.ArrayList;

/**
 * 
 * @author edney.souza
 * 
 * Esta classe apresenta duas formas de resolver a sequencia de Fibonacci, uma delas � por recursividade.
 *
 */
public class Fibonacci {
	
	
	public static void main(String[] args) {
		
		sequenciaFibonacci(13);
		System.out.println(fibonacci(7));
	}
	
	
	public static void sequenciaFibonacci(int valor) {
		
		int somaA = 1;
		int somaB = 0;
		int resultado = 0;
		ArrayList<Integer> listaFibonacci = new ArrayList<Integer>();
		
		while(resultado <= valor) {
			listaFibonacci.add(resultado);
			resultado = somaA + somaB;
			somaA = somaB;
			somaB = resultado;
		}
		listaFibonacci.remove(0);
		System.out.println(listaFibonacci.toString() + "A n-esima seguencia e: " + listaFibonacci.size());
	}

	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	    	return 1;
	    else
	    	return (fibonacci(n - 1) + fibonacci(n - 2));
	    /*
	     * Esta sequencia é dificil de entender, porém vou mostrar tudo que acontece passo por passo.
	     * vamos considerar que queremos saber a sétima sequencia fibonacci, entao vamos passar o valor 7 como argumento
	     * 
	     * passo 1 -> 7
	     * passo 2 -> 6+5
	     * passo 3 -> 5+4 | 4+3 
	     * passo 4 -> 4+3 | 3+2 | 3+2 | 2+1
	     * passo 5 -> 3+2 | 2+1 | 2+1 | 1+0 | 2+1 | 1+0 | 1+0 | 1
	     * passo 6 -> 2+1 | 1+0 | 1+0 | 1 | 1+0 | 1 | 1 | 0 | 1+0 | 1 | 1 | 0 | 1 | 0 1
	     * passo 7 -> 1+0+1+1+0+1+0+1+1+0+1+1+0+1+0+1+1+0+1+0+1
	     * RESULTADO = 13
	     * 
	     * O que precisamos saber é que, cada chamada recursiva, chama mais duas, ou seja, exponencialmente
	     * Observe que no passo 4, o método é chamado 8 vezes.
	     * 
	     * outra informacao: veja que quando as chamadas vao chegando no valor 0 ou 1, elas param, até a ultima chamada, depois somam-se 
	     * todos os números 1.
	     * 
	     * */
	}
	

}
