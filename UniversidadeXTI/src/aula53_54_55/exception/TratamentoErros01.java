package aula53_54_55.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Edney Roldao
 * 
 * Usamos exceptions para tratar erros que possam acontecer na linguagem
 *
 */
public class TratamentoErros01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("informe o numero: ");
			int numero = sc.nextInt();
			
			System.out.println("informe o divisor: ");
			int divisor = sc.nextInt();

			System.out.println(numero / divisor);
			
		} catch (InputMismatchException e) {
			System.out.println("Erro de input capturado");
		} catch (ArithmeticException e) {
			System.out.println("Erro: não podemos dividir por zero");
		}finally {
			sc.close();
		}
		
		
	}
	
}
