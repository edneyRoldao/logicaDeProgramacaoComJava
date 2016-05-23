package cursoCaelum.model;

public class Vetor {
	
	private Aluno[] alunos = new Aluno[100];
	
	private int totalAlunosAdicionados = 0;
	
	
	/**
	 * Percorrendo o array da esquerda para direita e adiciona um aluno quando encontrar uma posicao de valor nulo.
	 * 
	 * Perceba que o desempenho desse método piora a medida que mais alunos são adicionados, como é progressivo,
	 * chamamos de: CONSUMO LINEAR
	 * 
	 * @param aluno
	 */
	public void adicionaConsumoLinear(Aluno aluno) {
		for(int i = 0; i < this.alunos.length; i++) {
			if(this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}
	
	/**
	 * Uma forma de melhorar o desempenho do método acima, seria eliminar o laço criado somente para verificar a próximo posição vazia.
	 * 
	 * Solução: Vamos criar uma variável de classe que vai ser incrementada conforme vamos adicionando alunos, esse variável de tipo int
	 * vai sempre guardar a próxima posição vazia. Isso elimina o laço com for.
	 * 
	 * Agora o tempo que se leva para adicionar um aluno será sempre o mesmo, então...
	 * chamamos de: CONSUMO CONSTANTE
	 * 
	 * @param aluno
	 */
	public void adiciona(Aluno aluno) {
		alunos[this.totalAlunosAdicionados] = aluno;
		totalAlunosAdicionados++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		
		if(!this.isPosicaoValida(posicao))
			throw new IllegalArgumentException("Posicao invalida !");
		
		for(int i = this.totalAlunosAdicionados -1; i >= posicao; i -= 1)
			this.alunos[i + 1] = this.alunos[i];
		
		this.alunos[posicao] = aluno;
		this.totalAlunosAdicionados++;
	}
	
	public Aluno pega(int posicao) {
		if(!isPosicaoOcupada(posicao))
			throw new IllegalArgumentException("Posicao invalida !");

		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		
		if(!this.isPosicaoOcupada(posicao))
			throw new IllegalArgumentException("Posição inválida !");
		
		for(int i = posicao; i < this.totalAlunosAdicionados; i++)
			this.alunos[i] = this.alunos[i + 1];
		
		this.totalAlunosAdicionados--;
	}
	
	// Veja que esse metodo nao esta performatico, pois ele vai procurar por todo o array, ate mesmo as posicoes vazias
	public boolean contemProcessoLinear(Aluno aluno) {
		for(int i = 0; i < this.alunos.length; i++) {
			if(this.alunos[i] == aluno) return true;
		}
		return false;
	}
	
	// Vamos melhorar o metodo acima fazer uma pesquisa apenas nas posicoes que nao estao vazias
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < this.totalAlunosAdicionados; i++) {
			if(aluno.equals(this.alunos[i])) 
				return true;
		}
		return false;
	}
	
	// Esse processo é constante pois não existe laco de repeticao
	public int tamanho() {
		return this.totalAlunosAdicionados;
	}
	
	// Veja como ficaria o método acima pelo processo linear. Perceba que precisamos de um laco para calcular o numero de posicoes ocupadas
	public int tamanhoProcessoLinear() {
		int contaOcupados = 0;
		
		for(int i = 0; i < this.alunos.length; i++) {
			if(alunos[i] == null) {
				return contaOcupados;
			}
			contaOcupados++;
		}
		
		return contaOcupados;
	}
	
	public String toString() {
		if(this.totalAlunosAdicionados == 0) return "[]";
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < totalAlunosAdicionados - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalAlunosAdicionados - 1]);
		builder.append("]");
		
		return builder.toString();
	}

	// Como esse metodo nao possui condicional if, ele se torna mais performatico
	private boolean isPosicaoOcupada(int posicao) {
		// return this.alunos[posicao] != null ? true : false;
		return posicao >= 0 && posicao < this.totalAlunosAdicionados;
	}
	
	// Esse metodo verifica se a posicao passado no parametro esta dentro de posicoes que contem valores ja adicionados e assim seguir com o deslocamento
	private boolean isPosicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalAlunosAdicionados;
	}
	
}
