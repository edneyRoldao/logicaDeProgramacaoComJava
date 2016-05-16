package cursoCaelum.model;

public class TestePegarPorPosicao {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();

		a1.setNome("Rafael");
		a2.setNome("Paulo");

		Vetor lista = new Vetor();

		lista.adiciona(a1);
		lista.adiciona(a2);

		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);

		System.out.println(aluno1);
		System.out.println(aluno2);

	}

}
