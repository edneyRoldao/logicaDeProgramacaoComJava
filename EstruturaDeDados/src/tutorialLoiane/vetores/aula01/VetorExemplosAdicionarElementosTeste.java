package tutorialLoiane.vetores.aula01;

import java.util.Arrays;

import tutorialLoiane.vetores.util.VetorExemploToStringComStringBuilder;

public class VetorExemplosAdicionarElementosTeste {

	public static void main(String[] args) {
		
		VetorExemplosAdicionarElementos vetor  = new VetorExemplosAdicionarElementos(10);
		
		vetor.adicionarElementoProgressaoConstante("aula");
		vetor.adicionarElementoProgressaoConstante2("vetor");
		
		System.out.println(VetorExemploToStringComStringBuilder.toString(vetor.getElementos(), vetor.getControleTamanhoVetor()));
		System.out.println("-------------------");
		System.out.println("Usando a classe Arrays para retornar uma string com os elementos do vetor");
		System.out.println();
		System.out.println(Arrays.toString(vetor.getElementos()));
	}
	
}
