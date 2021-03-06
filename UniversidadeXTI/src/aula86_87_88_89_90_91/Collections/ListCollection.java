package aula86_87_88_89_90_91.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * A interface List e filha de Collections e e implementada elas classes:
 * LikedList
 * Vector
 * ArrayList
 * 
 * Basicamente a interface list é uma classe ordenada e que recebe itens duplicadas
 * 
 * @author edneyroldao
 *
 */
public class ListCollection {
	
	public static void main(String[] args) {
		
		List<String> listEsportes = new ArrayList<String>();
		listEsportes.add("Futebol");
		listEsportes.add("Basquete");
		listEsportes.add("Tenis");
		listEsportes.add("Volei");
		listEsportes.add("Natacao");
		listEsportes.add("Hockey");
		listEsportes.add("Box");
		listEsportes.add("Futebol");
		//Nao precisamos usar o metodo toString para imprimir toda o arrayList
		System.out.println(listEsportes);
		
		//Vamos usar um for e reatribuir o mesmo valor porem em letras maiusculas
		for(int i = 0; i < listEsportes.size(); i++) {
			String esporte = listEsportes.get(i);
			listEsportes.set(i, esporte.toUpperCase());
		}
		System.out.println(listEsportes);
		
		//Vamos usar o metodo indexOf para encontrar a posicao de um determinado elemento
		System.out.println(listEsportes.indexOf("BOX"));//todo index inicia com zero
		
		//podemos criar sublistas a partir de uma lista principal
		List<String> subListEsportes = listEsportes.subList(2, 4);
		System.out.println("recuperando uma lista a partir de outra: " + subListEsportes);
		
		//Podemos remover valores de uma determina lista a partir do metodo subList tambem, basta usar clear no final
		listEsportes.subList(2, 4).clear();
		System.out.println("removendo conjunto de elementos usando o metodo subList() e clear()" + listEsportes);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
