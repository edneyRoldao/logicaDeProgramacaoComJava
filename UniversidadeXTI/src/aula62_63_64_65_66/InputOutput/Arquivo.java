package aula62_63_64_65_66.InputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Edney Roldao
 * 
 * Vamos aprender a ler e escrever arquivos a partir da biblioteca java.nio introduzido no java 1.7.
 *
 */
public class Arquivo {
	
	public static void main(String[] args) throws IOException {
		
		// Classe que manipula o caminho das nossas pastas
		Path caminho = Paths.get("C:/javaIO/texto.txt"); // o arquivo não precisa existir.
		
		// Recuperar o camimho absoluto do arquivo
		System.out.println(caminho.toAbsolutePath());
		
		// Recuperar o pai do arquivo, no caso a pasta onde ele está
		System.out.println(caminho.getParent());
		
		// Recuperar a raiz do arquivo
		System.out.println(caminho.getRoot());
		
		// Recuperar o nome do arquivo
		System.out.println(caminho.getFileName());
		
		// Criando diretórios (estrutura de pastas)
		Files.createDirectories(Paths.get("C:/javaIO/pastaCriadaPeloJavaIO"));
		
		// Escrever e Ler arquivos
		byte[] texto = "Adicionando Texto pelo javaIO".getBytes();
		
		// Esse método cria o arquivo caso ele não exista, abre o arquivo para escrever a informação e depois fecha
		Files.write(caminho, texto);
		
		byte[] conteudoArquivo = Files.readAllBytes(caminho);
		String conteudo = new String(conteudoArquivo);
		System.out.println(conteudo);
		
	}

}
