package aula86_87_88_89_90_91.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author edneyroldao
 *	
 *	A interface Map nao e filha de Collection, Ela trabalha no esquema de chave-valor.
 *	As classes que implementam Map sao:
 *		TreeMap (a partir da interface SortedMap) 
 *		HashMap
 *		HashTable
 *		LinkedHashMap
 *	
 *	Obs: as chaves possuem valores unicos, porem podem receber valor duplicado	 
 *
 */
public class MapCollections {

	public static void main(String[] args) {
		
		//Declarando e adicionando valores
		Map<String, String> pais = new HashMap<>();
		//primeiro parametro e a chave e o segundo e o valor. para add usamos o metdo put(key, value)
		pais.put("BR", "Brasil");
		pais.put("GE", "Germany");
		pais.put("CN", "China");
		pais.put("US", "United States");
		System.out.println(pais);
		
		//podemos verificar a existencia de uma chave ou valor com containsKey ou containsValue
		System.out.println(pais.containsKey("GE")); //vai retornar um boolean
		System.out.println(pais.containsValue("Brasil")); //tbm vai retornar um boolean
		
		//Recuperando um conteudo pela chave
		String country = pais.get("US");
		System.out.println(country);
		
		//Podemos remover a aprtir de uma chave
		pais.remove("CN");
		System.out.println(pais);
		
		
		//Acredito que esta seja a parte mais importando deste interface
		//VAMOS RECUPERAR TODAS AS CHAVES DE UM MAP PARA PODER PERCORRE-LO, usando a interface set
		Set<String> keys = pais.keySet();
		//Agora vamos percorre o Map
		for(String key : keys) {
			System.out.println(key);
			//Recuperando o valor
			String valor = pais.get(key);
			System.out.println(valor);
		}
		
		
		
		
		
	}
	
	
	
}
