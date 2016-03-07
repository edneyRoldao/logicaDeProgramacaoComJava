package exerciciosDiversos;

import java.util.Scanner;

/**
 * Esta classe vai verifica se a palavra informada pelo usuario e um palindromo
 * @author Edney Roldao
 * 
 * WIKI:
    Um palíndromo é uma palavra, frase ou qualquer outra sequência de unidades (como uma cadeia de ADN; Enzima de restrição)
    que tenha a propriedade de poder ser lida tanto da direita para a esquerda como da esquerda para a direita.

	Num palíndromo, normalmente são desconsiderados os sinais ortográficos (diacríticos ou de pontuação), assim como o espaços entre palavras [1]
	A palavra "palíndromo" vem das palavras gregas palin ("para trás") e dromos ("corrida, pista") - que corre em sentido inverso.
 *
 */
public class Palindromo {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informe uma palavra: ");
		String nome  = sc.nextLine();
		
		isPalindromo(nome);
	}
	
	
	static void isPalindromo(String nome) {
		
		String nomeInvertido = "";
		
		// 1º: int i vai receber a quantidade de letras que a palavra informada possuí.
		// 2º: Aqui vai ocorrer um decremento. Pegamos a última letra e colocamos na primeira posicão até a palavra ficar totalmente invertida
		for(int i = nome.length() - 1; i >= 0; i--) {
			char letra = nome.charAt(i);
			nomeInvertido += letra;
		}
		
		//Agora vamos verificar se temos um palindromo comparando as duas palavras.
		//Temos aqui um ternário
		String resultado = nome.equals(nomeInvertido) ? "Temos um palindromo" : "Nao e um palindromo";
		
		System.out.println("******* RESULTADO *******");
		System.out.println(resultado);
		System.out.println("*************************");
		System.out.println("informado: " + nome);
		System.out.println("invertido: " + nomeInvertido);
		
	}

}
