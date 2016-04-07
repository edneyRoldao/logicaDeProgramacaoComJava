package reflectionsWithAnnotations.Example07;

import java.io.IOException;

public class CreateClass {
	
	public CreateClass() throws IOException {
		throw new IOException();
	}

	public static void main(String[] args) {
		
		try {
			
			CreateClass obj = CreateClass.class.newInstance();
			System.out.println(obj.toString());
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
}
