package aula69_70_71.trabalhandoComDatas;

import java.util.Date;

/**
 * A maioria dos metodos disponiveis no objeto data foram depreciados
 * 
 * Dica: O metodo compareTo que nao e exclusivo deste objeto pode ser considerado como um dos mais importantes
 * 
 * @author edneyroldao
 *
 */
public class ObjetoDate {

	public static void main(String[] args) {
		
		/* Quantidade de milisegundos deste 1970 */
		System.out.println(System.currentTimeMillis());
		
		/* Data atual do sistema */
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date();
		
		/* Metodos do objeto date que nao foram depreciados */
		data.getTime();
		data.setTime(1_000_000_000L);
		
		//Usando metodo compareTo
		System.out.println(data.compareTo(agora));
		// return = -1, a data e menor
		// return = 0, sao iguais
		// return = 1, data e maior
	}
	
}
