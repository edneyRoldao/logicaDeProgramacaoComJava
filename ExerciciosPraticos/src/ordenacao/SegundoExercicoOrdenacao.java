package ordenacao;

import java.util.Arrays;

/**
 * @author edney.souza
 * 
 * Proposta: Construir um metodo que recebe como parametro dois arrays simples com valores inteiros.
 * 			 Ambos ja estao com seus valores ordenados.
 * 			
 * 			 O metodo deve retornar um terceira array e este deve receber os valores dos dois arrays que serao
 * 			 passados como parametro. Este array deve ser retornado de forma ordenada						
 *
 */
public class SegundoExercicoOrdenacao {
	
	public static void main(String[] args) {
	
		int[] array01 = {12, 13, 14, 15, 22, 23, 24};
		int[] arra02 = {44, 45, 46, 47, 49};
		int[] array03 = juntarDoisArrays(array01, arra02);
		System.out.println(Arrays.toString(array03));
		
	}
	
	//Este método irá consolidar os dois arrays e um.
	public static int[] juntarDoisArrays(int[] a, int[] b) {
		
		//definando o tamanho do terceiro array
		int[] c = new int[a.length + b.length];
		
		//inserindo os valores do primeiro array no terceiro
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		//inserindo os valores do segundo array no terceiro
		for(int i = 0; i < b.length; i++){
			c[a.length + i] = b[i];
		}
		
		//agora vamos ordenar novamente o array
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length - 1; j++) {
				if(c[j] > c[j +1]){
					int aux = c[j];
					c[j] = c[j + 1];
					c[j + 1] = aux;
				}
			}
		}
		
		return c;
	}

}
