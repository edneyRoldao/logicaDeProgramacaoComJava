package reflectionsWithAnnotations.fifth;

/**
 * This is a simple example for retrieve an object through Object with method obj.getClass()
 * 
 * @author EdneyRoldao
 *
 */
public class RetrieveClassByObject {
	
	public static void main(String[] args) {
		
		Number obj = new Integer(100);
		Class<? extends Number> c = obj.getClass();
		System.out.println(c.getName());
		
	}

}
