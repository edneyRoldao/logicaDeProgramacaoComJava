package reflectionsWithAnnotations.thirdExample;

/**
 * 
 * 
 * @author Edney Roldao
 *
 */
public class TestPerformenceCallMethod {
	
	public static void main(String[] args) {
		double normal = runTest(new NormalInvoker());
		double reflection = runTest(new ReflectionInvoker());
		double reflectionCache = runTest(new ReflectionInvokerWithCache());
		
		System.out.println();
		System.out.println("Reflection     : " + (reflection / normal) + " more than normal called.");
		System.out.println("ReflectionCache: " + (reflectionCache / normal) + " more than normal called.");
	}
	
	public static double runTest(InvokeMethod invoker) {
		
		long millis = System.nanoTime();
		invoker.invokeMethod(100000);
		String className = invoker.getClass().getName();
		long difference = System.nanoTime() - millis;
		
		System.out.println("The class " + className + " delayed " + difference + " nano seconds");
		
		return difference;
	}

}
