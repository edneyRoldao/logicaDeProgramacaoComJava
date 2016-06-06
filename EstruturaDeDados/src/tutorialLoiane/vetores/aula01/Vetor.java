package tutorialLoiane.vetores.aula01;

/**
 * @author Edney Roldao
 * 
 * Tutorial sobre Estrutura de Dados - Loiane Groner
 *
 * aula 01 - vetores (array simples)
 */
@SuppressWarnings("unused")
public class Vetor {
	
	private String[] elementos;
	private int controleTamanhoVetor;
	
	
	// Com esse construtor, somos obrigados a passar o tamanho do array de elementos no momento da instancia��o.
	public Vetor(int tamanhoVetor) {
		elementos = new String[tamanhoVetor];
		controleTamanhoVetor = 0;
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

}
