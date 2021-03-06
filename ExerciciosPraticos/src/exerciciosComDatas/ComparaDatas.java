package exerciciosComDatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * 
 * @author edneyroldao
 *
 */
public class ComparaDatas {

	public static void main(String[] args) throws ParseException {
		System.out.println("A data maior é: "  + retornarDataMaisVelha("10/05/82", "15/08/88"));
	}
	
	public static String retornarDataMaisVelha(String data1, String data2) throws ParseException {
		DateFormat df = DateFormat.getDateInstance();
		Date d1 = df.parse(data1);
		Date d2 = df.parse(data2);
		Date dataMaior = d1.compareTo(d2) < 0 ? d1 : d2;
		return dataMaior.toString();
	}
	
}
