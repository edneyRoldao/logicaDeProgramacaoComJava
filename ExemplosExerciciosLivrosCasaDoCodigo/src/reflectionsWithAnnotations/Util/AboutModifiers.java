package reflectionsWithAnnotations.Util;

import java.lang.reflect.Modifier;

public class AboutModifiers {
	
	@SuppressWarnings("rawtypes")
	Class p = ProductEntity.class;
	
	public void checkAbstractModifiers() {
		
		int getModifiers = p.getModifiers();
		if(Modifier.isAbstract(getModifiers)) {
			// Do something...
		}
		
	}

}
