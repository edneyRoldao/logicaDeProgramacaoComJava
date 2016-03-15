package reflectionsWithAnnotations.fourthExample;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import reflectionsWithAnnotations.secondExample.Ignore;
import reflectionsWithAnnotations.secondExample.NameProperty;

/**
 * This class is one example to optimize methods that use reflections, in this
 * case we must pass the object directly in constructor.
 * 
 * This is a good practice because it check if the object matches before
 * execution.
 * 
 * @author Edney Roldao
 *
 */
public class GeradorDeMapasComPerformance {

	private Map<String, Method> properties = new HashMap<>();
	private Class<?> clazz;

	// Constructor
	public GeradorDeMapasComPerformance(Class<?> clazz) {
		this.clazz = clazz;

		for (Method m : clazz.getMethods()) {
			if (isGetter(m)) {
				String prop = null;
				if (m.isAnnotationPresent(NameProperty.class)) {
					prop = m.getAnnotation(NameProperty.class).value();
				} else {
					prop = convertGetMethodNameToPropertyName(m.getName());
				}
				properties.put(prop, m);
			}
		}
	}

	public Map<String, Object> gerarMapa(Object o) {
		if (!clazz.isInstance(o)) {
			throw new RuntimeException("O objeto não é da classe" + clazz.getName());
		}
		Map<String, Object> mapa = new HashMap<>();
		for (String propriedade : properties.keySet()) {
			try {
				Method m = properties.get(propriedade);
				Object valor = m.invoke(o);
				mapa.put(propriedade, valor);
			} catch (Exception e) {
				throw new RuntimeException("Problema ao gerar o mapa", e);
			}
		}
		return mapa;
	}

	/**
	 * 
	 * @param m
	 * @return true if method is a getter. It has three verifications.
	 */
	private static boolean isGetter(Method m) {
		boolean isGetter = m.getName().startsWith("get") && m.getReturnType() != Void.class
				&& m.getParameterTypes().length == 0 && !m.isAnnotationPresent(Ignore.class);
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
