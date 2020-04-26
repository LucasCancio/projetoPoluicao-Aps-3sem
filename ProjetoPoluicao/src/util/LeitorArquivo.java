package util;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorArquivo {
	
	public String lerTexto(String filePath) throws IOException {	
		String dados;
		Path path= Paths.get(filePath);
		
		
		dados = new String(Files.readAllBytes(path));
		
		return dados;	
	}

	public Object lerCSV(String filePath) throws Exception {
		Object object=null;//Ler CSV e transformar em JSON
		
		/*Path path= Paths.get(filePath);
		System.out.println(path);
		Scanner arquivo = new Scanner(Paths.get(filePath));
		
		while(arquivo.hasNextLine()){
			String linha = arquivo.nextLine();
			
			Scanner processaLinha = new Scanner(linha);
			processaLinha.useDelimiter(";");
						
			String posicao = processaLinha.next();
			String pais = processaLinha.next();
			int qtde    = processaLinha.nextInt();
			
			//System.out.println(posicao +  " " +pais+ "	" + qtde);
			//System.out.println(nome);
			
			json = linha;
		}*/
	
		return object;
		}
}
