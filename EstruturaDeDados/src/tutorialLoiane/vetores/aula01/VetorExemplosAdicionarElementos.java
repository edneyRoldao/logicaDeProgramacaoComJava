package tutorialLoiane.vetores.aula01;

/**
 * ESTRUTURA DE DADOS
 * @author Edney Roldao
 *
 *	Exemplos de métodos que adicionam elementos em um vetor (array simples)
 *
 */
public class VetorExemplosAdicionarElementos {

	// Atributos
	private String[] elementos;
	private int controleTamanhoVetor;
	
	
	/**
	 * DEFINICAO DO CONSTRUTOR
	 * Devemos definir um tamanho para o vetor no momento de instanciar esse classe.
	 * 
	 * @param tamanhoVetor
	 */
	public VetorExemplosAdicionarElementos(int tamanhoVetor) {
		elementos = new String[tamanhoVetor];
		controleTamanhoVetor = 0;
	}

	
	/**
	 * METODO COM PERFORMANCE DE PROGRESSAO LINEAR
	 * Quanto maior a numero de elementos adicionados nesse vetor, pior sera a perfornance
	 * desse metodo.
	 * 
	 * @param elemento
	 */
	public void adicionarElementoProgressaoLinear(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	/**
	 * METODO COM PERFORMANCE DE PROGRESSAO CONSTANTE 
	 * O tempo de execucao sempre sera o mesmo, pois nao temos que percorre a lista
	 * em busca da proxima posicao vazia como ocorre na progressao linear, pois agora
	 * temos uma variavel que guarda a ultima posicao com elemento adicionado no vetor.
	 * 
	 * @param elemento
	 */
	public void adicionarElementoProgressaoConstante(String elemento) {
		if(this.controleTamanhoVetor < this.elementos.length) {
			this.elementos[controleTamanhoVetor] = elemento;
			this.controleTamanhoVetor++;
		}else {
			throw new ArrayIndexOutOfBoundsException("O array j� est� cheio.");
		}
	}
	
	/**
	 * METODO COM PERFORMANCE DE PROGRESSAO CONSTANTE 
	 * 
	 * Esse approach e muito interessante pois podemos tratar de forma em uma outra hora
	 * um vetor que ja esta cheio (depois vamos aumentar o vetor dinamicamente) 
	 * 
	 * @param elemento
	 * @return true se o elemento foi adicionado com sucesso no vetor.
	 */
	public boolean adicionarElementoProgressaoConstante2(String elemento) {
		if(this.controleTamanhoVetor < this.elementos.length) {
			this.elementos[controleTamanhoVetor] = elemento;
			this.controleTamanhoVetor++;
			return true;
		}
		return false;
	}

	
	
	// Getters and Setters
	public String[] getElementos() {
		return elementos;
	}

	public void setElementos(String[] elementos) {
		this.elementos = elementos;
	}

	public int getControleTamanhoVetor() {
		return controleTamanhoVetor;
	}

	public void setControleTamanhoVetor(int controleTamanhoVetor) {
		this.controleTamanhoVetor = controleTamanhoVetor;
	}
	
}
