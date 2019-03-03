package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;

public class JsonTeste {
	public static void main(String[] args) throws FileNotFoundException {		
		Gson gson = new Gson();
		Reader reader = new FileReader("src/main/resources/json_sample.json");
		Itens itens = gson.fromJson(reader, Itens.class);
		
		System.out.println(itens);
	}
}
