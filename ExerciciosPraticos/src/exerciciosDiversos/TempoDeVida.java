package exerciciosDiversos;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author edneyroldao
 * This class is working with time of live through many ways
 */
public class TempoDeVida {
	
	public static void main(String[] args) {
		
		//Informe a sua data e nascimento e retorna os dias de vida.
		System.out.println(calcularDiasDeVida("10/05/1982"));
		
		//Informe os dias de vida e imprime anos, meses e dias
		calcularIdade(12262);
		
	}
	
	public static int calcularDiasDeVida(String data) {
		
		DateFormat df = DateFormat.getDateInstance();
		Date dataNascimento = null;
		try {
			dataNascimento = df.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Informe a data no formato correto, dd/MM/aaaa");
		}
		
		Calendar dataNascimentoAux = Calendar.getInstance();
		Calendar dataHoje = Calendar.getInstance();
		dataNascimentoAux.setTime(dataNascimento);
		
		int diasEmAnosCompletos = (dataHoje.get(Calendar.YEAR) - ((dataNascimentoAux.get(Calendar.YEAR) + 1))) * 365;
		int diasPrimeiroAno = 365 - dataNascimentoAux.get(Calendar.DAY_OF_YEAR);
		int diasAnoAtual = dataHoje.get(Calendar.DAY_OF_YEAR);
		
		return diasEmAnosCompletos + diasPrimeiroAno + diasAnoAtual;
	}

	/**
	 * Neste metodo informa-se os dias de vida e imprime a idade em anos, meses e dias
	 * @param diasDeVida
	 */
	public static void calcularIdade(int diasDeVida) {
		
		int anos = 0;
		int meses = 0;
		int dias = 0;
		
		//Calculando os anos
		while(diasDeVida - 365 >= 0) {
			anos++;
			diasDeVida -= 365;
		}
		
		//Calculando os meses
		while(diasDeVida - 30 >= 0) {
			meses++;
			diasDeVida -= 30;
		}
		
		dias = diasDeVida;
		
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
	}
	
}
