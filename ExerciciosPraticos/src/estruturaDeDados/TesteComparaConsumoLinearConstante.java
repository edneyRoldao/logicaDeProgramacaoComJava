package estruturaDeDados;

import java.util.Date;

/**
 * @author Edney Roldao
 *
 *	Essa e uma classe de teste que compara o tempo de desempenho entre um processo LINEAR E CONSTANTE
 *
 */
public class TesteComparaConsumoLinearConstante {

	public static void main(String[] args) {
		
		testaDesempenhoConsumoLinear(1000);
		testaDesempenhoConsumoConstante(1000);
	}

	// Atributos
	private Aluno[] alunos = new Aluno[1000];
	private int totalAlunosAdicionados = 0;

	// METODO CONSUMO LINEAR
	public void adicionaConsumoLinear(Aluno aluno) {
		for (int i = 0; i < this.alunos.length; i++) {
			if (this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}

	// METODO CONSUMO CONSTANTE
	public void adicionaConsumoConstante(Aluno aluno) {
		alunos[this.totalAlunosAdicionados] = aluno;
		totalAlunosAdicionados++;
	}

	// Metodo auxiliar que calcula o tempo de consumo do processo linear
	public static void testaDesempenhoConsumoLinear(int posicoes) {
		long tempoInicial = new Date().getTime();
		TesteComparaConsumoLinearConstante lista = new TesteComparaConsumoLinearConstante();
		for (int i = 0; i < posicoes; i++) {
			String nome = GeraNomeUtil.getGeraNomesAleatorios();
			Aluno a = new Aluno();
			a.setNome(nome);
			lista.adicionaConsumoLinear(a);
		}
		long tempoFinal = new Date().getTime();
		System.out.println("Tempo gasto para adicionar 1000 alunos em um array pelo processo linear: " + (tempoFinal - tempoInicial));
	}

	// Metodo auxiliar que calcula o tempo de consumo do processo constante
	public static void testaDesempenhoConsumoConstante(int posicoes) {
		long tempoInicial = new Date().getTime();
		TesteComparaConsumoLinearConstante lista = new TesteComparaConsumoLinearConstante();
		for (int i = 0; i < posicoes; i++) {
			String nome = GeraNomeUtil.getGeraNomesAleatorios();
			Aluno a = new Aluno();
			a.setNome(nome);
			lista.adicionaConsumoConstante(a);
		}
		long tempoFinal = new Date().getTime();
		System.out.println("Tempo gasto para adicionar 1000 alunos em um array pelo processo constante: " + (tempoFinal - tempoInicial));
	}

}
