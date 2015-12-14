package aula99.recursividade;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecursividadeAvancado {

	public static void main(String[] args) {
		listarArquivosEPastasDoSistema(Paths.get("/usr/"));
	}
	
	
	/*
	 * Como este funciona:
	 * 
	 * Se for um arquivo, imprime o caminho inteiro, caso contrario imprime o caminho da pasta adicionando o caminho de todos 
	 * arquivos que est�o l� dentro em um directoryStream, fazemos um forEach e adicionamos cada um dos caminhos recuperados como
	 * par�metro do pr�prio m�todo, ent�o ecorre a pilha (recurs�o). 
	 * 
	 * */
	public static void listarArquivosEPastasDoSistema(Path caminho) {
		if(Files.isRegularFile(caminho)) {
			System.out.println(caminho.toAbsolutePath());
		}else {
			String aux = "\n" + caminho.toAbsolutePath();
			System.err.println(aux.toUpperCase());
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(caminho)) {
				for (Path p : stream) {
					//Aqui ocorre a recursividade deste m�todo
					listarArquivosEPastasDoSistema(p);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
