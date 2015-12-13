package workingWithDates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class FirstExampleDateFormat {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar date = Calendar.getInstance();
		
		//formatacao de data
		DateFormat format = DateFormat.getDateInstance();
		System.out.println(format.format(date.getTime())); // Como este metodo recebe um obj do tipo date, temos que usar getTime
		
		//formatacao de hora
		format = DateFormat.getTimeInstance();
		System.out.println(format.format(date.getTime()));
		
		//Estilos de formatacao
		format = DateFormat.getDateInstance(DateFormat.FULL);//data completa
		System.out.println(format.format(date.getTime()));
		
		format = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(format.format(date.getTime()));
		
		format = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(format.format(date.getTime()));
		
		format = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(format.format(date.getTime()));
		
		//Convertendo uma String em date
		Date data2 = format.parse("13/12/2015"); // o ano pode ser com dois numeros tambem
		System.out.println(data2);
		
		//Usamos o SimpleDateFormat para defirmos um formato diferente para nossas datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date data3 = sdf.parse("13-12-2015");
		System.out.println(data3);
		
	}

}
