package reflectionsWithAnnotations.fifth;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * This class explain how classForName work when we need to connect with JDBC.
 *
 * @author EdneyRoldao
 *
 */
public class ClassForNameExample {

	private Map<Class<?>, Class<?>> getImplAndInterfaceByPropertyFile = new HashMap<>();
	
	// Constructor
	public ClassForNameExample(String fileName)throws IOException, ClassNotFoundException{
		
		Properties p = new Properties();
		p.load(new FileInputStream(fileName));
		
		for(Object interf : p.entrySet()) {
			Class<?> interfType = Class.forName(interf.toString());
			Class<?> implType = Class.forName(p.get(interf).toString());
			getImplAndInterfaceByPropertyFile.put(interfType, implType);
		}
	
	}
	
	public Class<?> getImplClasses(Class<?> interf) {
		return getImplAndInterfaceByPropertyFile.get(interf);
	}
	
}
