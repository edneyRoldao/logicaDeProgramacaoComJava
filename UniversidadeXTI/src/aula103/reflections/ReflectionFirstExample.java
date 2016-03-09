package aula103.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * REFLECTIONS são utilizados para examinar todos os detalhes de uma classe, exemplo:
 * 		- seus campos
 * 		- quem elas extendem e implementam
 * 		- seus métodos
 * 		- seus pacotes
 * 		- seus construtores
 * 
 * 	Também podemos chamar Reflections de Introspecção.
 * 
 * Qual a utilidadde de se usar Reflection ?
 * 		A introspecção é um subconjunto da reflexão que permite um programa a obter
		informações a respeito de si próprio. A partir das informações obtidas com a
		introspecção, é possível manipular instâncias acessando seus atributos e invocando
		seus métodos. Dessa forma, é possível criar um código que lida com uma classe
		cuja estrutura ele não conhece.
		
	Resumindo: Podemos descobrir os metodos e atributos de uma classe apenas informando o seu nome e pacote. Além disso, podemos criar instências dessa classe e 
				invocar seus métodos.
		
 * 
 * 
 * @author Edney Roldao
 *
 */
public class ReflectionFirstExample {
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//Recuperando uma classe
		String nomeDaClasse = "aula103.reflections.ContaBancaria";
		Class getClass = Class.forName(nomeDaClasse);
		
		//Recuperando o nome da classe:
		String nomeSimplesClasse = getClass.getSimpleName();
		System.out.println(nomeSimplesClasse);
		
		System.out.println("----------------------------");
		
		//Recuperando todos os campos da classe com o modificador public
		Field[] listaAtribPublic = getClass.getFields();
		for (Field field : listaAtribPublic) {
			System.out.println(field.getName());
			System.out.println("nome completo: " + field);
		}
		
		System.out.println("----------------------------");
		
		//Recuperando os nomes dos métodos com qualquer modificador de acesso:
		Method[] listaMetodos = getClass.getDeclaredMethods();
		for (Method method : listaMetodos) {
			System.out.println(method.getName());
			System.out.println("nome completo: " + method);
		}
		
		System.out.println("----------------------------");
		
		//Recuperando os nomes dos construtores
		Constructor[] construtor = getClass.getConstructors();
		System.out.println(Arrays.toString(construtor));
		
		//Criando a instancia a partir
		Object conta = getClass.newInstance();
		
		//Preparando o metodo para ser chamada a partir do objeto criado acima
		Method sacar = getClass.getMethod("sacar", double.class);
		
		//Chamar o metodo:
		sacar.invoke(conta, 120);
		
		//Criando um objeto a partir de um construtor
		Constructor objFromConstructor = getClass.getConstructor(double.class, int.class, String.class);
		Object obj = objFromConstructor.newInstance(45.75, 4545, "Edney");
		//Recuparando o metodo toString para ser chamado a partir do objeto criado pelo construtor
		Method toString = getClass.getMethod("toString");
		String a = (String) toString.invoke(obj);
		System.out.println(a);
	}

}
