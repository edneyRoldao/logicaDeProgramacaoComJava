package aula86_87_88_89_90_91.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author edneyroldao
 *
 *A interface set nao aceita registros duplicados
 *
 *	As classes que implementam essa interface sao:
 *	TreeSet
 *	HashSet
 *	LinkedHashSet
 *
 */
public class SetCollections {

	public static void main(String[] args) {
		
		String[] cores = new String[]{"Azul", "Amarelo", "Preto", "Azul", "Amarelo", "Preto"};
		List<String> listaCores = Arrays.asList(cores);
		System.out.println(listaCores);
		
		//As setList nao permitem valores repetidos, portanto só mantem registros unicos
		Set<String> listaCoresSemRepetir = new HashSet<String>(listaCores);
		System.out.println("Os valores nao se repetem com a interface Set" + listaCoresSemRepetir);
	}
	
}
