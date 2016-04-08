package reflectionsWithAnnotations.Example07;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UseConstructor {

	public UseConstructor(String s) {
		System.out.println("Construtor invocado com: " + s);
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Class<UseConstructor> c = UseConstructor.class;
		Constructor<UseConstructor> contructor = c.getConstructor(String.class);
	
		try {
			
			UseConstructor obj = contructor.newInstance("Test");
			System.out.println(obj.toString());
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e ) {
			e.printStackTrace();
		} catch (InvocationTargetException e ) {
			e.printStackTrace();
			System.out.println("Excecao lancada pelo construtor: " + e.getTargetException());
		}
		
	}
	
}
