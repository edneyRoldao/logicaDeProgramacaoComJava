package aula99.recursividade;
/**
 * 
 * @author edney.souza
 * 
 * Um m�tdodo recursivo geralmente divide um problema em duas partes, uma que ele sabe resolver,
 * e a outra que ele n�o sabe, esta parte deve ser parecida com a parte principal, um pouco mais simples ou menor.
 * 
 * Como � parecido, podemos chamar o mesmo m�todo para resolver este menor.
 *
 *A recursividade � quando o m�todo chama a si mesmo formando uma pilha at� que ocorre a chamada que vai ter um retorno que vai finaliza-lo.
 *
 *Lembre-se, quando estamos trabalhando com pilha, o �ltimo que entra � o primeiro a sair.
 *
 */
public class Recursividade {
	
	public static void main(String[] args) {
		
		//Primeiro exemplo
		System.out.println(soma(10));
		
		//Segundo exemplo
		System.out.println(fn(7));
		
		//Terceiro exemplo
		System.out.println(potencia(3, 4));
		
		//Quarto exemplo
		System.out.println(fatorial(6));

	}
	
	
	//PRIMEIRO EXEMPLO - xti
	//Exemplo mais f�cil de entender
	public static int soma(int x) {
		if(x == 0) 
			return x;
		else 
			return x + soma(x -1) + 3;
		//Vamos ver o que acontece quando colocamos o valor de 10 para x na execu��o do m�todo
		// 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1))))))))) = 55
	}
	
	
	//SEGUNDO EXEMPLO - teste uol
	public static int fn(int n) {
		
		if(n <= 1) {
			return 1; //condi��o b�sica
		}else if(n % 2 == 0) {
			return fn(n/2) + 2;
		}else {
			return fn(n -1) + 3;
		}
		//Vamos ver o que acontece quando colocamos o valor de 7 para x na execu��o do m�todo
		//	VALOR DE n			-			VALOR GUARDADO PARA SOMAR NO FINAL
		//		7				-			 + 3	-	entra no 3� return
		//		6				-			 + 2	-	entra no 2� return
		//		3				-			 + 3	-	entra no 3� return
		//		2				-			 + 2	-	entra no 2� return
		//		1				-			 + 1 	-	entra no 1� return e sai da recurs�o, soma total = 11
		//----------------------------------------------------------------------------------------------------
	}
	
	
	//TERCEIRO EXEMPLO - xti
	public static int potencia(int numero, int expoente) {
		if(expoente == 1){ // condi��o b�sica
		
			return numero;

		}else{
			
			return numero * potencia(numero, expoente - 1);
		}
			//Neste caso temos uma multiplica��o como resultado. Vamos entender o fluxo quando numero = 3 e expoente = 4.
			//	VALOR DE numero/expoente		VALOR GUARDADO PARA MULTIPLICAR NO FINAL
			//		3/4				-			 3 *	-	entra no 2� return
			//		3/3				-			 3 *	-	entra no 2� return
			//		3/2				-			 3 *	-	entra no 2� return
			//		3/1				-			 3  	-	entra no 2� return
			// Montando a estrutura do resultado, ficaria assim: 3 * 3 * 3 * 3 = 81
	}
	
	
	
	public static int fatorial(int valor) {
		
		if(valor == 1) { //condi��o b�sica
			return 1;
		}else {
			return valor * fatorial(valor - 1);
		}
		
	}
	
	
	
	
	
	
	
}
