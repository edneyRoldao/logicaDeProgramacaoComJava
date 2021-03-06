package trabalhandoComLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Conversoes {
	
	public static void main(String[] args) {
		
		//Declarando um vetor, lista simples, se collections
		String[] vectorList = new String[]{"Ronaldo", "Rivaldo", "Djalminha", "Marcelinho Carioca"};
		System.out.println(Arrays.toString(vectorList));
		
		//Primeira forma de se declarar Collections
		Collection<String> arrayList = new ArrayList<String>();
		arrayList.add("Neto");
		arrayList.add("Romario");
		arrayList.add("Ronaldo Giovaneli");
		arrayList.add("Cafu");
		System.out.println(arrayList);
		
		//Segunda forma de declarar Collections
		List<String> arrayList2 = Arrays.asList("Germany", "Brazil", "Italy");
		System.out.println(arrayList2);
		
		
		/* CONVERSOES */
		//Convertendo um vetor em array com a classe auxiliar de Arrays
		Integer[] vetor = new Integer[]{1, 2, 3, 4};
		List<Integer> list = Arrays.asList(vetor);
		System.out.println(list);
		
		//Transformando uma collecao em vetor
		List<Double> list2 = Arrays.asList(2.0, 3.5, 6.6, 7.8);
		Double[] vetor2 = list2.toArray(new Double[list2.size()]);
		System.out.println(Arrays.toString(vetor2));
		
	}

}
