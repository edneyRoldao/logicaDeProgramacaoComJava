package cursoCaelum.model;

public class TesteAdicionaNoFIm {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();

		a1.setNome("João");
		a2.setNome("José");

		Vetor lista = new Vetor();

		lista.adiciona(a1);
		lista.adiciona(a2);

		System.out.println(lista);

	}

}
