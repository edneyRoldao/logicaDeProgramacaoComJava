package workingWithDates;

import java.util.Date;

/**
 * 
 * @author edneyroldao
 *
 *	A classe Date sera depreciada, portanto utilizaremos somente os
 *	metodos que continuaram a ser usados	
 *
 */
public class FirstExampleDates {
	
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
		System.out.println(data.compareTo(agora));
		// return = -1, a data e menor
		// return = 0, sao iguais
		// return = 1, data e maior
	}
	
	

}
