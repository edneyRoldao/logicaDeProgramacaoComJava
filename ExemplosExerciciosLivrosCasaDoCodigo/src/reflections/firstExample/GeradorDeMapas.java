package reflections.firstExample;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * In order to practice my English skills, I'm going to write all comments in English. 
 * 
 * This concepts about reflections and annotations were got from book written by Casa do Código
 *
 * @author Edney Roldao
 *
 */
public class GeradorDeMapas {

	/**
	 * 
	 * @param obj
	 * @return a map with a methods list retrieved from parameter passed. 
	 */
	public static Map<String, Object> gerarMapaMetodos(Object obj) {
		
		Class<?> classe = obj.getClass();
		Map<String, Object> mapMethods = new HashMap<>();
		
		for(Method m : classe.getMethods()) {
			try {
				if(isGetter(m)) {
					String prop = convertGetMethodNameToPropertyName(m.getName());
					Object value = m.invoke(obj);
					mapMethods.put(prop, value);
				}
			} catch (Exception e) {
				throw new RuntimeException("There are some problems during generate methods map.", e);
			}
		}
		
		return mapMethods;
	}
	
	/**
	 * 
	 * @param m
	 * @return true if method is a getter. It has three verifications.
	 */
	private static boolean isGetter(Method m) {
		boolean isGetter = m.getName().startsWith("get") && m.getReturnType() != Void.class && m.getParameterTypes().length == 0;
		return isGetter;
	}
	
	/**
	 * 
	 * @param getterName
	 * @return the property name from a get method name.
	 */
	private static String convertGetMethodNameToPropertyName(String getterName) {
		
		StringBuffer turnBackProp = new StringBuffer();
		turnBackProp.append(getterName.substring(3, 4).toLowerCase());
		turnBackProp.append(getterName.substring(4));
		
		return turnBackProp.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
