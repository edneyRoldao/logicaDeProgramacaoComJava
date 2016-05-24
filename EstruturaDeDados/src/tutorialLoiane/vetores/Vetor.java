package tutorialLoiane.vetores;

/**
 * @author Edney Roldao
 * 
 * Tutorial sobre Estrutura de Dados - Loiane Groner
 *
 * aula 01 - vetores (array simples)
 */
public class Vetor {
	
	private String[] elementos;
	private int controleTamanhoVetor;
	
	
	// Com esse construtor, somos obrigados a passar o tamanho do array de elementos no momento da instancia��o.
	public Vetor(int tamanhoVetor) {
		elementos = new String[tamanhoVetor];
		controleTamanhoVetor = 0;
	}
	
	
	///////// IMPLEMENTA��O DOS M�TODOS ///////////
	
	// Progress�o linear
	public void adicionarElementoProgressaoLinear(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	// Progress�o constante
	public void adicionarElementoProgressaoConstante(String elemento) {
		if(this.controleTamanhoVetor < this.elementos.length) {
			this.elementos[controleTamanhoVetor] = elemento;
			this.controleTamanhoVetor++;
		}else {
			throw new ArrayIndexOutOfBoundsException("O array j� est� cheio.");
		}
	}

	// Progress�o constante
	public boolean adicionarElementoProgressaoConstanteComBoolean(String elemento) {
		if(this.controleTamanhoVetor < this.elementos.length) {
			this.elementos[controleTamanhoVetor] = elemento;
			this.controleTamanhoVetor++;
			return true;
		}
		return false;
	}
	
	public void adicionarElemento(int posicao, String elemento) {
		
	}
	
	public void removerElemento(int posicao) {
		
	}
	
	public String buscarElemento(int posicao) {
		return null;
	}
	
	public int buscarPosicaoElemento(String elemento) {
		return 0;
	}
	
	public int obterTamanhoVetor() {
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
