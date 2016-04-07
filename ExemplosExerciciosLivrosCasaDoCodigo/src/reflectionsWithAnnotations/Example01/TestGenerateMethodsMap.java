package reflectionsWithAnnotations.Example01;

import java.util.Map;

public class TestGenerateMethodsMap {
	
	public static void main(String[] args) {
		
		Produto computer = new Produto("Sony vaio", "leptops", 3.200, "Core i7");
		
		Map<String, Object> props = GeradorDeMapas.gerarMapaMetodos(computer);
		
		for(String prop : props.keySet()) {
			System.out.println(prop + " = " + props.get(prop));
		}
 		
	}

}
