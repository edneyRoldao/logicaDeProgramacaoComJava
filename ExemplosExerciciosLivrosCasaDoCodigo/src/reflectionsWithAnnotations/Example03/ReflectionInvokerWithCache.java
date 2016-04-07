package reflectionsWithAnnotations.Example03;

import java.lang.reflect.Method;

public class ReflectionInvokerWithCache implements InvokeMethod{

	@Override
	public void invokeMethod(int vezes) {
		try {
			Produto prod = new Produto();
			Method m = prod.getClass().getMethod("emptyMethod");
			for(int i = 0; i < vezes; i++) {
				m.invoke(prod);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Error, the method doesn't called.", e);
		}
	}

}
