package ordenacao;

import java.util.Random;

public class OrdenacaoQuickSortBasic {
	
	
	public static void main(String[] args) {
		Random r = new Random();
		Integer[] arrayTest = new Integer[1000000];
		for(int i = 0; i < arrayTest.length; i++) {
			arrayTest[i] = r.nextInt(999);
		}
		
		Long inicio = System.currentTimeMillis();

		new OrdenacaoQuickSortBasic().quickSort(arrayTest);
		
		Long fim = System.currentTimeMillis();
		
		Long result = fim - inicio;
		System.out.println("Tempo:" + result);

	}
	
	
	
	public void quickSort(Integer[] array) {
		quickSorting(array, 0, array.length - 1);
	}
	
	public void quickSort(Integer[] array, int firstIndex, int lastIndex) {
		quickSorting(array, firstIndex, lastIndex);
	}
	
	private void quickSorting(Integer[] array, int firstIndex, int lastIndex) {
		
		int j;
		if(firstIndex < lastIndex) {
			j = partition(array, firstIndex, lastIndex);
			quickSorting(array, firstIndex, j - 1);
			quickSort(array, j + 1, lastIndex);
		}
			
	}
	

	private int partition(Integer[] array, int firstIndex, int lastIndex) {
		
		int c = array[firstIndex];
		int i = firstIndex + 1;
		int j = lastIndex;
		int aux;
		
		while(i <= j) {
			if(array[i] <= c)
				++i;
			else if(c < array[j])
				--j;
			else {
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				++i;
				--j;
				
			}
		}
		
		array[firstIndex] = array[j];
		array[j] = c;
		
		return j;
	}
	
}
