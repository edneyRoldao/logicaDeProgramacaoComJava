package aula69_70_71.trabalhandoComDatas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author edneyroldao
 *
 */
public class ObjetoCalendar {

	public static void main(String[] args) {
		
		Calendar a = Calendar.getInstance(); // aqui e retornado um gregorian calendar
		Calendar b = new GregorianCalendar(); // e a mesmo coisa
		
		b.set(1982, Calendar.MAY, 10);

		Date data = a.getTime(); // return um objeto do tipo calendar
		System.out.println(data);
		
		// Recuperando o ano da data
		int ano = a.get(Calendar.YEAR);
		System.out.println(ano);
		
		// Recuperar o mes
		int mes = a.get(Calendar.MONTH); // 0-11, onde 0 e janeiro e 11 dezembro
		System.out.println(mes + 1);
		
		// Recuperando o dia, pode ser: da semana, do mes ou do ano
		int diaDoMes = a.get(Calendar.DAY_OF_MONTH);
		System.out.println(diaDoMes);
		
		//Podemos setar esses campos substituindo o metodo get por set passando os parametros
		
		//Podemos limpar os campos de uma data passando o metodo clear
		b.clear(Calendar.MINUTE);
		
		//Podemos adicionar ou diminuir valores em cada campo, exemplo, 
		//adicionar mais dias ou mais anos em cada campo, vamos adicionar mais 1 ano
		a.add(Calendar.YEAR, 1);
		int adicionadoMaisUmAno = a.get(Calendar.YEAR);
		System.out.println(adicionadoMaisUmAno);
	}
	
}
