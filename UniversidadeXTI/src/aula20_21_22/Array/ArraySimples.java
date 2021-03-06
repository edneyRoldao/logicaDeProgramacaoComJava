package aula20_21_22.Array;

import java.util.Arrays;

public class ArraySimples {
	
	public static void main(String[] args) {
		
		//Formas de declarar
		String[] paises = {"Brasil", "England"};
		
		//ou
		int[] numeros = new int[5];

		//Atribuir valor
		String pais = paises[1];
		System.out.println(pais);
		
		//ou
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		//Para acessar
		System.out.println(paises[0]);
		
		
		//Vanos usar uma classe auxiliar chamada Arrays para manipulacao de arraySimples
		//para imprimir todo o array
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(paises));
		
		//Podemos recuperar a posicao de um elemento com o metodo binarySearch(nomeArray, valorElemento) 
		int posicao = Arrays.binarySearch(paises, "Brasil");
		System.out.println(posicao);
		
		//Vamos ordenar uma lista com a classe Arrays.sort(nomeArray, int posicaoInicialParaOrdenacao, int posicaoFinalParaOrdenar)
		int[] numerosDesordenados = {32, 15, 1, 76, 45, 22, 3, 7};
		Arrays.sort(numerosDesordenados, 0, numerosDesordenados.length);
		System.out.println(Arrays.toString(numerosDesordenados));
		
		//Podemos acesso metodos das classes happer ou qualquer objeto que tenha metodos apos a definicao do index
		Double[] valores = {12.45, 78.35, 66.66, 4.57};
		double valor = valores[2].doubleValue();
		System.out.println(valor);
	}

}
