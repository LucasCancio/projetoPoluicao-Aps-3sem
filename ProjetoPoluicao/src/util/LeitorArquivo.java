package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class LeitorArquivo {

	public String lerTexto(String filePath) throws IOException {
		String dados;
		Path path = Paths.get(filePath);
		dados = new String(Files.readAllBytes(path));
		return dados;
	}

	public ArrayList<String> lerCSV(String filePath) throws Exception {

		ArrayList<String> linhas = new ArrayList();

		Scanner arquivo = new Scanner(Paths.get(filePath));

		while (arquivo.hasNextLine()) {
			String linha = arquivo.nextLine();
			Scanner processaLinha = new Scanner(linha);
			
			processaLinha.useDelimiter(";");
			linhas.add(linha);

		}
		return linhas;
	}
}
