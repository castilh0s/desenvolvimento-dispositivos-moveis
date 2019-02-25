
public class RetanguloTeste {
	public static void main(String[] args) throws Exception {
		validate(args);

		Double sideA = Double.valueOf(args[0]);
		Double sideB = Double.valueOf(args[1]);

		Retangulo retangulo = new Retangulo(sideA, sideB);
		System.out.println(retangulo);
	}

	private static void validate(String[] args) throws Exception {
		if (args.length != 2) {
			throw new Exception("Necessário passar dois valores númericos como parâmetro.");
		}
	}
}
