package reflectionsWithAnnotations.Example06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RetrieveHierarchyClassInfo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the complete name of class: ");
		String className = sc.nextLine();
		
		try {
			
			Class<?> clazz = Class.forName(className);
			printHierarchy(clazz, 1);
			
		} catch (ClassNotFoundException e) {
			System.out.println("The class " + className + "doesn't found");
		}finally {
			sc.close();
		}
		
	}
	
	
	private static void printHierarchy(Class<?> clazz, int level) {
		
		List<Class<?>> list = getSuperClassAndInterfaces(clazz);
		String recuo = "";
		
		for(int i = 0; i < level; i++) {
			recuo += "  ";
		}
		
		for(Class<?> c : list) {
			System.out.println(recuo + "|-> " +c.getName());
			if(c != Object.class) {
				printHierarchy(c, level + 1);
			}
		}
		
	}
	
	
	private static List<Class<?>> getSuperClassAndInterfaces(Class<?> clazz) {
	
		List<Class<?>> list = new ArrayList<>();
		
		if(clazz.getSuperclass() != null) {
			list.add(clazz.getSuperclass());
			list.addAll(Arrays.asList(clazz.getInterfaces()));
		}
		
		return list;
	}

}
