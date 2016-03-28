package reflectionsWithAnnotations.fifth;

import java.io.IOException;

public class ClassForNameExampleTest {
	
	public static void main(String[] args) {
		
		try {

			ClassForNameExample f = new ClassForNameExample("arquivoProp.property");
			Class<?> impl = f.getImplClasses(Object.class);
			System.out.println("Implementation retrieved: " + impl.getName());
			
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Error: we can't get implementations: " + e.getMessage());
		}
		
	}

}
