package aula61.expressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Basicamente sao padroes de pesquisa no formato String.
 * Servem para validar padroes como e-mails, cpf, telefone.

	Para criar expressoes regulares temos que utilizar os recursos a seguir:
	
	________________________________________________
	MODIFICADORES:
		(?i)	-	Ignora maiusculas e minusculas
		(?x)	-	comentarios
		(?m)	-	multilinhas
		(?s)	-	Dottal
	________________________________________________
 	_____________________________________________________________________________________
 	METACARACTERES
 		.	-	qualquer caracter
 		\d	-	numeros 											-	[0-9]
 		\D	-	nao aceita numeros									-	[^0-9]
 		\s	-	procura a ocorrencia de qualquer tipo de espaco		-	[ \t\n\x0B\f\r]
 		\S	-	qualquer coisa que nao seja espaco					-	[^\s]
 		\w	-	aceita letras e numeros								-	[a-zA-Z_0-9]
 		\W	-	qualquer coisa que nao seja letras e numeros
  	_____________________________________________________________________________________
  	_________________________________________________________
  	QUANTIFICADORES
  		X{n}	X, 	exatamente n vezes
  		X{n,}	X, 	pelo menos n vezes
  		X{n, m}	X, 	pelo menos n mas nao mais do que m vezes
  		X?		X, 	0 ou 1 vez
  		X*		X, 	0 ou + vezes
  		X+		X, 	1 ou + vezes
  	__________________________________________________________
  	____________________________
  	METACARACTERES DE FRONTEIRA
  		^	inicia
  		$	finaliza
  		|	ou
  	____________________________
  	_________________________________
  	AGRUPADORES
  		[...]			agrupamento
  		[a-z]			Alcance
  		[a-e][i-u]		Uniao
  		[a-z&&[aeiou]]	Intersecao
  		[^abc]			excecao
  		[a-z&&[^m-p]]	Subtracao
  		\X				Fuga literal
  	_________________________________
  	
  	
 * 
 * @author edneyroldao
 *
 */
public class ExpressaoRegular {
	
	public static void main(String[] args) {
		
		//Primeiro exemplo	-	vamos validar se o valor da variavel possui a palavra Java, sendo case sensitive
		String expReg = "Java";
		String texto = "Java";
		boolean temPadrao = texto.matches(expReg); //aqui estamos verificando se a variavel texto passa pela expressao
		System.out.println("exemplo 01: " + temPadrao);
		//fim
		
		//Segundo exemplo	-	Vamos montar o mesmo padrao que nao seja case sensitive usando o modificador (?i)
		String expReg2 = "(?i)Java";
		boolean temPadrao2 = "JAVA".matches(expReg2);
		System.out.println("exemplo 02: " + temPadrao2);
		//fim
		
		//Terceiro exemplo	-	Verificando a existencia de caracteres utilizando metacaracteres
		String expReg3 = ".";
		boolean temPadrao3 = "@".matches(expReg3);
		System.out.println("exemplo 03: " + temPadrao3);
		//fim
		
		//Quarto exemplo	-	Existencia de numeros, obs: temos que usar duas barras \\ pois a primeira e o caracter de scape
		boolean temPadrao4 = "2".matches("\\d");
		System.out.println("exemplo 04: " + temPadrao4);
		//fim
		
		//Quinto exemplo	-	verificando a axistencia de mais de um padrao, no caso tres caracteres
		String expReg5 = "...";
		System.out.println("exemplo 05: " + "acc".matches(expReg5));
		//fim
		
		//Sexto exemplo	-	verificando a axistencia de quatro numeros
		String expReg6 = "\\d\\d\\d\\d";
		System.out.println("exemplo 06: " + "2222".matches(expReg6));
		//fim
		
		//Setimo exemplo	-	Verificando padrao de CEP, no caso: 00000-000
		String isCep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		System.out.println("exemplo 07, padrao de cep: " + "02343-030".matches(isCep));
		//fim
		
		//Oitavo exemplo	-	Verificando padrao de CEP com o uso de quantificadores
		String isCep2 = "\\d{5}-\\d{3}";
		System.out.println("exemplo 08, padrao de cep com quantificadores: " + "02343-030".matches(isCep2));
		//fim
		
		//Nono exemplo	-	Verificando pelo menos a quantidade definida
		String expReg7 = "\\d{3,}";
		System.out.println("exemplo 09, Deve ter no minimo 3 numeros: " + "023".matches(expReg7));
		//fim
		
		//Decimo exemplo	-	Verificando minimo e maximo
		String expReg8 = "\\d{3,5}";
		System.out.println("exemplo 10, Deve ter no minimo 3 e no maximo 5 numeros: " + "02773".matches(expReg8));
		//fim

		// Decimo primeiro exemplo	-	mais sobre quantificadores
		boolean a = "".matches(".?"); // 0 ou 1 caracter
		boolean b = "".matches(".*"); // 0 ou mais caracteres
		boolean c = "1".matches(".+"); // 1 ou mais caracteres
		System.out.println("padrao zero ou um caracteres: " + a);
		System.out.println("padrao zero ou mais caracteres: " + b);
		System.out.println("padrao um ou mais caracteres: " + c);
		//fim
		
		//Decimo segundo exemplo	-	Verificando padrao de data com o uso de quantificadores
		String isDate = "\\d{2}/\\d{2}/\\d{4}";
		System.out.println("exemplo 12, padrao de data com quantificadores: " + "02/02/2015".matches(isDate));
		//fim
		
		//Decimo terceiro exemplo	-	Verificando padrao utilizando metacaracteres de fronteira, deve iniciar com a palavra java e terminar com dois numeros.
		String hasWord = "^java\\d{2}";
		System.out.println("exemplo 13, usando metacaracteres de fronteira para definir como a palavra deve ser iniciada: " + "java22".matches(hasWord));
		//fim
		
		//Decimo quarto exemplo	-	Verificando padrao utilizando metacaracteres de fronteira, deve finalizar com a palavra java e iniciar com dois numeros.
		String hasWord2 = "\\d{2}java$";
		System.out.println("exemplo 14, usando metacaracteres de fronteira para definir como a palavra deve ser finalizada: " + "22java".matches(hasWord2));
		//fim
		
		//Decimo quinto exemplo - Vamos verificar se existe uma determinada palavra dentro de um texto.
		boolean hasWord3 = "Has word java here".matches(".*java.*");
		System.out.println("exemplo 15, checando a existencia de uma palavra na frase: " + hasWord3);
		//fim
		
		//Decimo sexto exemplo - Vamos aplicar o ultimo metacaracter de fronteira. Ele avalia a presenca de uma palavra ou outra
		boolean hasOneWordOrAnother = "sim".matches("sim|nao");
		System.out.println("exemplo 16, uso de metacaracter de fronteira ou (|) " + hasOneWordOrAnother);
		//fim
		
		//Decimo setimo exemplo, um padrao que verifica se a primeira letra e maiuscula
		System.out.println("exemplo 17, verifica se a palavra inicia com letra maiuscula: " + "Marjorie".matches("[A-Z][a-zA-Z]*"));
		//fim
		
		//Decimo oitavo exemplo, usando exclusao. O padrao aceita (olho) e nao aceita (alho)
		boolean aceptWord = "alho".matches("[^a]lho");
		System.out.println(aceptWord);
		//fim
		
		//Outros
		boolean d = "crau".matches("cr[ae]u"); // aceito crau ou creu
		System.out.println(d);
		
		//Validando um padrao de email:
		String checkEmail = "\\w+@\\w+\\.\\w{2,3}";
		boolean isEmail = "edney@yahoo.com".matches(checkEmail);
		System.out.println("Expressao para padrao de email: " + isEmail);
		//fim
		
		//Utilizando a classe Pattern para criacao das nossas expressoes regulares
		//A vantagem dessa abordagem e a performance, ou seja, ela e muito mais performatica.
		//Vamos imprimir todas as ocorrencias de uma determinada palavra usando expressoes regulares
		String doce = "Qual e o doce mais Doce que o doCe de batata doce";
		String expReg4 = "(?i)doce";
		Matcher matcher = Pattern.compile(expReg4).matcher(doce);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		/* SUBSTITUICOES */
		//podemos usar expressoes regulares para substituir palavras.
		//Vamos trocar todas as ocorrencias de doce por docinho.
		String doceChange = doce.replaceAll(expReg4, "docinho");
		System.out.println("Usando expressoes regulares junto com replaceAll para trocar palavras: " + doceChange);
		//fim
		
	}

}
