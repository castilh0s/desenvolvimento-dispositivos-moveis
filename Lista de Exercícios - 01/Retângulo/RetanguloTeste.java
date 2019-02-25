
public class RetanguloTeste {
	public static void main(String[] args) throws Exception {
		validate(args);
	}

	private static void validate(String[] args) throws Exception {
		if (args.length != 2) {
			throw new Exception("Necessário passar dois valores númericos como parâmetro.");
		}
	}
}
