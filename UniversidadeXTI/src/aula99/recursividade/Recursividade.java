package aula99.recursividade;
/**
 * 
 * @author edney.souza
 * 
 * Um metdodo recursivo geralmente divide um problema em duas partes, uma que ele sabe resolver,
 * e a outra que ele nao sabe, esta parte deve ser parecida com a parte principal, um pouco mais simples ou menor.
 * 
 * Como e parecido, podemos chamar o mesmo metodo para resolver este menor.
 *
 *A recursividade ocorre quando o metodo chama a si mesmo formando uma pilha ate que ocorre a chamada que vai ter um retorno que vai finaliza-lo.
 *
 *Lembre-se, quando estamos trabalhando com pilha, o ultimo que entra e o primeiro a sair.
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
	//Exemplo mais facil de entender
	public static int soma(int x) {
		if(x == 0) 
			return x;
		else 
			return x + soma(x -1) + 3;
		//Vamos ver o que acontece quando colocamos o valor de 10 para x na execucao do metodo
		// 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1))))))))) = 55
	}
	
	
	//SEGUNDO EXEMPLO - teste uol
	public static int fn(int n) {
		
		if(n <= 1) {
			return 1; //condicao basica
		}else if(n % 2 == 0) {
			return fn(n/2) + 2;
		}else {
			return fn(n -1) + 3;
		}
		//Vamos ver o que acontece quando colocamos o valor de 7 para x na execucao do metodo
		//	VALOR DE n			-			VALOR GUARDADO PARA SOMAR NO FINAL
		//		7				-			 + 3	-	entra no terceiro return
		//		6				-			 + 2	-	entra no segundo return
		//		3				-			 + 3	-	entra no terceiro return
		//		2				-			 + 2	-	entra no segundo return
		//		1				-			 + 1 	-	entra no primeio return e sai da recursao, soma total = 11
		//----------------------------------------------------------------------------------------------------
	}
	
	
	//TERCEIRO EXEMPLO - xti
	public static int potencia(int numero, int expoente) {
		if(expoente == 1){ // condicao basica
		
			return numero;

		}else{
			
			return numero * potencia(numero, expoente - 1);
		}
			//Neste caso temos uma multiplicacao como resultado. Vamos entender o fluxo quando numero = 3 e expoente = 4.
			//	VALOR DE numero/expoente		VALOR GUARDADO PARA MULTIPLICAR NO FINAL
			//		3/4				-			 3 *	-	entra no segundo return
			//		3/3				-			 3 *	-	entra no segundo return
			//		3/2				-			 3 *	-	entra no segundo return
			//		3/1				-			 3  	-	entra no segundo return
			// Montando a estrutura do resultado, ficaria assim: 3 * 3 * 3 * 3 = 81
	}
	
	
	public static int fatorial(int valor) {
		
		if(valor == 1) { //condicao basica
			return 1;
		}else {
			return valor * fatorial(valor - 1);
		}
		
	}
	
}
