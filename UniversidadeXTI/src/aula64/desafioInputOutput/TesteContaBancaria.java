package aula64.desafioInputOutput;

import java.util.List;

public class TesteContaBancaria {
	
	public static void main(String[] args) {
				
		ContaBancaria c = new ContaBancaria("Joao", 1000.00f);
		GerenciaContas.gravarConta(c);
		
		List<ContaBancaria> contas = GerenciaContas.carregaListaContas();
		for(ContaBancaria conta : contas) {
			System.out.println(conta.toString());
		}
		System.out.println(contas.size());
	}

}
