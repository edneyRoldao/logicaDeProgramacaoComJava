package reflectionsWithAnnotations.Example05;

/**
 * The code below shows you how to use reflections with static references.
 * This approach is used when we need to pass a Class instance with parameter of methods.
 * 
 * @author EdneyRoldao
 *
 */
public class UsingStaticReferencesTest {

	public static void main(String[] args) {
		Class<String> clazz = String.class;
		System.out.println(clazz.getName());
		printClassName(Integer.class);
	}
	
	public static void printClassName(Class<?> clazz) {
		System.out.println("Called the method with: " + clazz.getName());
	}
	
}
