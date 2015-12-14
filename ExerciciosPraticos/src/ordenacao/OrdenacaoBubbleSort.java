package ordenacao;

/**
 * 
 * @author edneyroldao
 * Exemplos de ordenacao de listas
 *
 */
public class OrdenacaoBubbleSort {
	
	public static void main(String[] args) {
		String[] listaDesordenada = new String[]{"Zelda", "Giselle", "Edney", "Arlindo", "Morjorie", "Nadine"};
		
		String[] listaOrdenada = ordenarListaBubleSort(listaDesordenada);
		for(int i = 0; i < listaOrdenada.length; i++) {
			System.out.println(listaOrdenada[i]);
		}
	}
	
	//Esta e a forma mais comum de ordenar uma lista sem o uso do metodo sort presente 
	// em toda lista que implementa e interface Collections. Chamamos de BubbleSort
	public static String[] ordenarListaBubleSort(String[] listaNaoOrdenada) {
		for(int i = 0; i < listaNaoOrdenada.length; i++) {
			for(int j = 0; j < listaNaoOrdenada.length - 1; j++) {
				if(listaNaoOrdenada[j].compareTo(listaNaoOrdenada[j + 1]) > -1) {
					String aux = listaNaoOrdenada[j];
					listaNaoOrdenada[j] = listaNaoOrdenada[j + 1];
					listaNaoOrdenada[j + 1] = aux;
				}
			}
		}
		return listaNaoOrdenada;
	}
	

}
