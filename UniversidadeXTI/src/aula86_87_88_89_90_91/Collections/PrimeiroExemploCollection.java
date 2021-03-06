package aula86_87_88_89_90_91.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 
 * COMO MANIPULAR INTERFACES QUE EXTENDEM A INTERFACE COLLECTIONS
 * 
 * @author edneyroldao
 * 
 * A interface Collections e mae de tres outras grandes interfaces: Set, List e Queue
 * Os exemplos abaixo ensinam como manipular as listas.
 * 
 * Observacao importante: A interface Map nao e filha de Collections, porem ele sera abordada juntamente.
 *
 */
public class PrimeiroExemploCollection {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<String>();
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("sera que vai me remover");
		
		//O metodo toString vai imprimir todo lista
		System.out.println("metodo toString: " + c.toString());
		
		//O metodo isEmpty vai verificar se a lista esta vazia, retornando true ou false
		System.out.println("verifica se a lista esta vazia: " + c.isEmpty());
		
		//O metodo contains tambem pode ser usado em listas, retorna true ou false
		System.out.println("Verifica a existencia da ocorrencia de algum valor na colecao: " + c.contains("D"));
		
		//Podemos remover um elemento da lista se soubermos todo o seu conteudo
		c.remove("sera que vai me remover");
		System.out.println("removendo um elemento da colecao: " + c.toString());
		
		/* grupos */
		//Temos uma classe auxiliar que usamos para manipular arrays, Arrays
		//Transforma um array simples(vetor) em lista que implementa collections
		Collection<String> c2 = Arrays.asList("O", "U");
		
		//Vamos adicionar todos os elementos de um array em outro
		c.addAll(c2);
		System.out.println("juntando duas listas: " + c.toString());
		
		//Temos o metodo containsAll que verifica a existencia de uma lista completa dentro da outra
		System.out.println("metodo containsAll: " + c.containsAll(c2));
		
		//Tambem existe o metodo removeAll que remove todos os elementos de uma lista contida em outra
		c.removeAll(c2);
		System.out.println("metodo removeAll: " + c.toString());

		//Convertendo uma lista de collections em um erray simples (vetor)
		String[] vetor = c.toArray(new String[c.size()]);
		//Podemos usar a classe auxilar citada acima para imprimir esse vetor usando o toString
		System.out.println("usando Arrays.toString para imprimir um vetor: " + Arrays.toString(vetor));

		//podemos usar o metodo clear() para limpar toda list collection
		c.clear();
		System.out.println("limpando toda colecao com metodo clear(): " + c.toString());
	}
	
}
