package aula65.IO_check_delete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOCreateDeleteCheck {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/aulaIOJava/texto.txt");
		Files.exists(path);
		
	}
	
}
