package reflectionsWithAnnotations.thirdExample;

import java.lang.reflect.Method;

public class ReflectionInvoker implements InvokeMethod {

	@Override
	public void invokeMethod(int vezes) {

		try {
			// Add Java Bean class with method that must tested.
			Produto prod = new Produto();
			for (int i = 0; i < vezes; i++) {
				// Calling method.
				Method m = prod.getClass().getMethod("emptyMethod");
				m.invoke(prod);
			}

		} catch (Exception e) {
			throw new RuntimeException("Error, the method doesn't called.", e);
		}
	}

}
