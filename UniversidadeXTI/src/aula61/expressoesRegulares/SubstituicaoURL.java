package aula61.expressoesRegulares;

/**
 * Resolvi separar o ultimo exercicio da aula de expressoes regulares pois e o mais interessante e complexo.
 * 
 * 		Digamos que a sua empresa precisa modificar o padrao de URL de todas as paginas, podemos usar expressoes para isso.
 * 		
 * 
 * 
 * @author edneyroldao
 *
 */
public class SubstituicaoURL {

	public static void main(String[] args) {
		
		// url atual: www.xti.com.br/clientes-2011.html
		String url = "www.xti.com.br/clientes-2011.html";
		System.out.println("url antes da substituicao: " + url);
		// novo padrao: http://www.xti.com.br/2011/clientes.jsp
		
		//Vamos criar um padrao de substituicao a partir da propria expressao regular.
		
		//primeiro vamos criar a expressao regular para encontrar as url's antigas
		// A diferenca nessa expressao e que estou separando po () cada trecho da expressao para ser usada com variavel
		String expressaoRegular = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		/* separando a url para entender: (www.xti.com.br) / (\\w{2,}) - (\\d{4}) .html  */
		
		//Testendo a expressao criada
		boolean testaExpressao = url.matches(expressaoRegular);
		System.out.println("Testando a expressao regular: " + testaExpressao);
		
		//http://www.xti.com.br/2011/clientes.jsp
		//Criando uma expressao para nova url (acima) a partir da expressao regular criada.
		String expressaoDeSubstituicao = "http://$1/$3/$2.jsp";
		
		String novaUrl = url.replaceAll(expressaoRegular, expressaoDeSubstituicao);
		System.out.println("nova url utilizando replaceAll a partir de expressoes regulares: " + novaUrl);
		
	}
	
}
