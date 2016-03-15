package reflectionsWithAnnotations.secondExample;

import java.util.Map;

/**
 * Now we have the same classes used in the first example, but it has some treatment with annotations.
 * @author Edney Roldao
 * 
 * Explanation: 
 * The field getOperadora is annotated with an annotation @Ignore, so it won't printed on main method. 
 *
 */
public class TestGenerateMethodsMap {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.setCodigoPais("55");
		phone.setOperadora("21");
		
		Map<String, Object> props = GeradorDeMapas.gerarMapaMetodos(phone);
		
		for(String prop : props.keySet()) {
			System.out.println(prop + " = " + props.get(prop));
		}
 		
	}

}
