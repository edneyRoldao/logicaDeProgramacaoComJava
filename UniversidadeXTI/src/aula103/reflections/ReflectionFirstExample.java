package aula103.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * REFLECTIONS s�o utilizados para examinar todos os detalhes de uma classe, exemplo:
 * 		- seus campos
 * 		- quem elas extendem e implementam
 * 		- seus m�todos
 * 		- seus pacotes
 * 		- seus construtores
 * 
 * 	Tamb�m podemos chamar Reflections de Introspec��o.
 * 
 * Qual a utilidadde de se usar Reflection ?
 * 		A introspec��o � um subconjunto da reflex�o que permite um programa a obter
		informa��es a respeito de si pr�prio. A partir das informa��es obtidas com a
		introspec��o, � poss�vel manipular inst�ncias acessando seus atributos e invocando
		seus m�todos. Dessa forma, � poss�vel criar um c�digo que lida com uma classe
		cuja estrutura ele n�o conhece.
		
	Resumindo: Podemos descobrir os metodos e atributos de uma classe apenas informando o seu nome e pacote. Al�m disso, podemos criar inst�ncias dessa classe e 
				invocar seus m�todos.
		
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
		
		//Recuperando os nomes dos m�todos com qualquer modificador de acesso:
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
