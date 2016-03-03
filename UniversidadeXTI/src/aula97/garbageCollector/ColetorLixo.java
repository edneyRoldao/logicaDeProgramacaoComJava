package aula97.garbageCollector;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author edney.souza
 * 
 * Utilizado para limpeza da memória quando os Objetos e variáveis perdem suas referências.
 * 
 * Alguns Métodos
 * 		gc()	
 *			- Solicita a JVM para limpar os objetos que não estão sendo mais utilizados, porém ela é meio rebelde 
 *			  pois não te obedece na mesma hora, isso pode levar um tempo e ela não te avisa quando
 * 
 * 		runFinalization()
 *			- Exitem objetos que não perderam sua referência, porém eles não são mais alcançáveis, então este método
 *			  solicita à JVM que execute os finalizadores desses objetos para serem recolhidos posteriormente, porém 
 *			  nós já sabemos sobre o temperamento dela.
 *
 *  	freeMemory()
 *  		- Retorna uma estimativa de bytes livres no sistema
 *  
 * 		totalMemory()
 * 			- Retorna o total de bytes na memoria do sistema
 * 
 * 		maxMemory()
 * 			- Retorna a quantidade máxima de memória em bytes que a JVM sempre tentará utiliza
 * 
 * OBS: esses métodos são acessíveis a partir da classe Runtime
 * 
 * 		Por default este processo ocorre em duas partes, primeiro a JVM percorre todo o sistema e realiza uma marcação
 * 		nos objetos e variáveis que não perderam as suas referencias, em seguida ele passa novamente deletando todos
 * 		os dados que não possuem a marcação que a mesma realizou no passo anterior
 * 
 */
public class ColetorLixo {
	
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		//Este resultado é retornado em bytes
		//Vamos converter para megaBytes
		int MB = 1_048_576; // total de bytes em 1 mega
		double memoriaTotal = rt.maxMemory() / MB;
		
		double memoriaAposExecucaoMetodo = memoriaTotal - (testarUsoMemoria()/MB);
		System.out.println("Total de memória disponível antes da execução do método: " + memoriaTotal);
		System.out.println("Memória livre após execução do médoto: " + memoriaAposExecucaoMetodo);
		rt.runFinalization();
		rt.gc();
		double memAposAcaoGarbageCollector = memoriaTotal - (rt.freeMemory()/MB);
		System.out.println("Memória livre após as chamdas dos métodos runFinalization() e gc(): " + memAposAcaoGarbageCollector);
		
	}

	//Este método vai retornar a memória livre após a execução do for com um loop gigante
	//O objetivo deste métdo, é testar no main o funcionamento do GarbageCollector
	public static double testarUsoMemoria() {
		List<Integer> lista = new ArrayList<>();
		for(int i = 0; i < 1_000_000; i++) {
			lista.add(i);
		}
		return Runtime.getRuntime().freeMemory();
	}
	
	
}
