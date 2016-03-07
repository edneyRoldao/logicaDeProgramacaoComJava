package exerciciosDiversos;

import java.util.Scanner;

/**
 * Esta classe vai verifica se a palavra informada pelo usuario e um palindromo
 * @author Edney Roldao
 * 
 * WIKI:
    Um pal�ndromo � uma palavra, frase ou qualquer outra sequ�ncia de unidades (como uma cadeia de ADN; Enzima de restri��o)
    que tenha a propriedade de poder ser lida tanto da direita para a esquerda como da esquerda para a direita.

	Num pal�ndromo, normalmente s�o desconsiderados os sinais ortogr�ficos (diacr�ticos ou de pontua��o), assim como o espa�os entre palavras [1]
	A palavra "pal�ndromo" vem das palavras gregas palin ("para tr�s") e dromos ("corrida, pista") - que corre em sentido inverso.
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
		
		// 1�: int i vai receber a quantidade de letras que a palavra informada possu�.
		// 2�: Aqui vai ocorrer um decremento. Pegamos a �ltima letra e colocamos na primeira posic�o at� a palavra ficar totalmente invertida
		for(int i = nome.length() - 1; i >= 0; i--) {
			char letra = nome.charAt(i);
			nomeInvertido += letra;
		}
		
		//Agora vamos verificar se temos um palindromo comparando as duas palavras.
		//Temos aqui um tern�rio
		String resultado = nome.equals(nomeInvertido) ? "Temos um palindromo" : "Nao e um palindromo";
		
		System.out.println("******* RESULTADO *******");
		System.out.println(resultado);
		System.out.println("*************************");
		System.out.println("informado: " + nome);
		System.out.println("invertido: " + nomeInvertido);
		
	}

}
