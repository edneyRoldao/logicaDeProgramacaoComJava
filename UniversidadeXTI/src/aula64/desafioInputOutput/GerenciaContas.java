package aula64.desafioInputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GerenciaContas {
	
	static Charset charset = StandardCharsets.UTF_8;
	static Path caminho = Paths.get("C:/javaIO/desafioConta/contasBancarias.txt");

	
	public static void gravarConta(ContaBancaria conta) {
		
		List<ContaBancaria> lista = carregaListaContas();
		StringBuilder texto = new StringBuilder();
		
		for(ContaBancaria c : lista) {
			texto.append(c.getCliente() + ";" + c.getSaldo() + "\n");
		}
		
		texto.append(conta.getCliente() + ";" + conta.getSaldo());
		
		try {
			
			BufferedWriter writer = Files.newBufferedWriter(caminho, charset);
			writer.write(texto.toString());
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<ContaBancaria> carregaListaContas() {
		
		List<ContaBancaria> contas = new ArrayList<>();
		
		try {
			
			BufferedReader reader = Files.newBufferedReader(caminho, charset);
			String linha = null;
			
			while((linha = reader.readLine()) != null) {
				String[] conta = linha.split(";");
				contas.add(new ContaBancaria(conta[0], Float.valueOf(conta[1])));
			}
			
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return contas;
	}
	
}
