package aula62_63_64_65_66.InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Edney Roldao
 * 
 * Utilizamos BufferedWriter e BufferedReader para trabalhar com arquivo de texto grande.
 */
public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		
		Path caminho = Paths.get("C:/javaIO/texto.xls");
		Charset utf8 = StandardCharsets.UTF_8;
		
		////////////// ESCREVER EM ARQUIVOS ////////////////////////////////////
		// Essa forma de inicializar é somente a partir do Java 7
		try(BufferedWriter wr = Files.newBufferedWriter(caminho, utf8)) {

			wr.write("Adicionando textto com:\n ");
			wr.write("BufferedWriter\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		///////////////////////////////////////////////////////////////////////
		
		///////////////////// LEITURA DE ARQUIVOS ////////////////////////////////////
		try(BufferedReader br = Files.newBufferedReader(caminho, utf8)) {

			String linha = null;
			
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		///////////////////////////////////////////////////////////////////////
		
	}
	
}
