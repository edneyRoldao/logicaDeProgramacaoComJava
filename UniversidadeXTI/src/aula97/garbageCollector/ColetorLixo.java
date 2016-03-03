package aula97.garbageCollector;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author edney.souza
 * 
 * Utilizado para limpeza da mem�ria quando os Objetos e vari�veis perdem suas refer�ncias.
 * 
 * Alguns M�todos
 * 		gc()	
 *			- Solicita a JVM para limpar os objetos que n�o est�o sendo mais utilizados, por�m ela � meio rebelde 
 *			  pois n�o te obedece na mesma hora, isso pode levar um tempo e ela n�o te avisa quando
 * 
 * 		runFinalization()
 *			- Exitem objetos que n�o perderam sua refer�ncia, por�m eles n�o s�o mais alcan��veis, ent�o este m�todo
 *			  solicita � JVM que execute os finalizadores desses objetos para serem recolhidos posteriormente, por�m 
 *			  n�s j� sabemos sobre o temperamento dela.
 *
 *  	freeMemory()
 *  		- Retorna uma estimativa de bytes livres no sistema
 *  
 * 		totalMemory()
 * 			- Retorna o total de bytes na memoria do sistema
 * 
 * 		maxMemory()
 * 			- Retorna a quantidade m�xima de mem�ria em bytes que a JVM sempre tentar� utiliza
 * 
 * OBS: esses m�todos s�o acess�veis a partir da classe Runtime
 * 
 * 		Por default este processo ocorre em duas partes, primeiro a JVM percorre todo o sistema e realiza uma marca��o
 * 		nos objetos e vari�veis que n�o perderam as suas referencias, em seguida ele passa novamente deletando todos
 * 		os dados que n�o possuem a marca��o que a mesma realizou no passo anterior
 * 
 */
public class ColetorLixo {
	
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		//Este resultado � retornado em bytes
		//Vamos converter para megaBytes
		int MB = 1_048_576; // total de bytes em 1 mega
		double memoriaTotal = rt.maxMemory() / MB;
		
		double memoriaAposExecucaoMetodo = memoriaTotal - (testarUsoMemoria()/MB);
		System.out.println("Total de mem�ria dispon�vel antes da execu��o do m�todo: " + memoriaTotal);
		System.out.println("Mem�ria livre ap�s execu��o do m�doto: " + memoriaAposExecucaoMetodo);
		rt.runFinalization();
		rt.gc();
		double memAposAcaoGarbageCollector = memoriaTotal - (rt.freeMemory()/MB);
		System.out.println("Mem�ria livre ap�s as chamdas dos m�todos runFinalization() e gc(): " + memAposAcaoGarbageCollector);
		
	}

	//Este m�todo vai retornar a mem�ria livre ap�s a execu��o do for com um loop gigante
	//O objetivo deste m�tdo, � testar no main o funcionamento do GarbageCollector
	public static double testarUsoMemoria() {
		List<Integer> lista = new ArrayList<>();
		for(int i = 0; i < 1_000_000; i++) {
			lista.add(i);
		}
		return Runtime.getRuntime().freeMemory();
	}
	
	
}
