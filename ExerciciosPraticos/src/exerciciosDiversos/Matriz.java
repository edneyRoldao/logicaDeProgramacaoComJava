package exerciciosDiversos;

/**
 * 
 * @author edneyroldao
 *
 *Esta classe transforma um array simple em um bi-dimensional
 *
 *		exemplo: String[] arraySimples = {"A1","A2","A3","B1","B2","B3","C1","C2","C3"};
 *		
 *				String[][] arrayDuplo = { {"A1","B1","C1"}, {"A2","B2","C2"}, {"A3","B3","C3"} }; 				
 *
 *
 */
public class Matriz {
	
	public static void main(String[] args) {
		
		String[] lista = {"A1","A2","A3","B1","B2","B3","C1","C2","C3"};
		
		String[][] listaDupla = retornaMartriz(lista);
		for(int i = 0; i < 3; i++) { 
			for(int j = 0; j < 3; j++) {
				System.out.print(listaDupla[i][j]);
				System.out.print(" ");
			}
			System.out.print("  ");
		}
	}
	
	public static String[][] retornaMartriz(String[] original) {
		
		int matriz = (int) Math.sqrt(original.length);
		
		String[][] resultado = new String[matriz][matriz];
		
		for(int i = 0; i < matriz; i++) {
			int c = 0;
			for(int j = 0; j < matriz; j++) {
				resultado[i][j] = original[i + c];
				c += matriz;
			}
		}
		
		return resultado;
	}

}
