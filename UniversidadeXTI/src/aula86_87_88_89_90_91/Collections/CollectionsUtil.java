package aula86_87_88_89_90_91.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author edneyroldao
 *
 *	Vamos utilizar a interface Collections como auxiliar para manipulacao de listas, assim como a classe Arrays
 *	A interface Collections pode manipular qualquer colecao na linguagem java	
 *
 *	Existem metodos que so vamos encotrar na classe Collections como por exemplo o metodo sort()
 *
 */
public class CollectionsUtil {

	public static void main(String[] args) {
		
		List<String> listFrutas = new ArrayList<String>();
		listFrutas.add("Guarana");
		listFrutas.add("Uva");
		listFrutas.add("Manga");
		listFrutas.add("Acai");
		listFrutas.add("Banana");

		//Usando o metodo sort()
		Collections.sort(listFrutas);
		System.out.println("metodo sort() " + listFrutas);
		
		//podemos inverter a ordem, tipo um desc
		Collections.reverse(listFrutas);
		System.out.println("metodo reverse() " +listFrutas);
		
		//Temos o metodo shuffle
		Collections.shuffle(listFrutas);
		System.out.println("metodo shuffle() " +listFrutas);
		
		//podemos usar collections para adicionar diversos itens na lista
		Collections.addAll(listFrutas, "Laranja", "Melancia", "Laranja");
		System.out.println("Adicionando mais itens a lista com o metodo addAll() " + listFrutas);
		
		//Como arrayList aceita valores duplicados, podemos usar Collections para saber
		//quantas vezes um determinado elemento aparece em uma lista
		System.out.println("numero de vezes que um elemento aparece na lista: " + Collections.frequency(listFrutas, "Laranja"));
		
		//A classe collections possui um metodo chamado disjoint que se parece com o metodo containsAll,
		//nos passamos uma lista princial e uma subLista, assim ele vai verificar se os elementos da subLista
		//estao contidos na lista principal returnando true ou false.
		List<String> subListFrutas = Arrays.asList("Acerola", "Graviola");
		boolean isContains = Collections.disjoint(listFrutas, subListFrutas);
		System.out.println("Utilizando o metodo disjoint que e semelhando ao containsAll: " + isContains);
		
		//Vamos descobrir a posicao de um determinado elemento com o metodo binarySearch
		Collections.sort(listFrutas);
		System.out.println(Collections.binarySearch(listFrutas, "Banana"));
		
		//Podemos substituir todos os elementos de uma lista com o metodo fill
		Collections.fill(listFrutas, "Maca");
		System.out.println("trocando todos os valor de uma colecao: " + listFrutas);
		
		//podemos criar uma colecao que nao pode ser modificado, ou seja, uma constante (modificador final)
		Collection<String> LISTA_FRUTAS = Collections.unmodifiableCollection(listFrutas);
		System.out.println("Esta lista nao pode ser modificada" + LISTA_FRUTAS);
		
	}
	
}
