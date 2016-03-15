package reflectionsWithAnnotations.thirdExample;

public class NormalInvoker implements InvokeMethod {

	@Override
	public void invokeMethod(int vezes) {

		//Add Java Bean class with method that must tested.
		Produto prod = new Produto();
		
		for(int i = 0; i < vezes; i++) {
			//Calling method.
			prod.emptyMethod();
		}
	}

}
