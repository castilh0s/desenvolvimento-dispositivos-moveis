
public class FaturaTeste {
	public static void main(String[] args) throws Exception {
		validate(args);

		String codigo = args[0];
		String descricao = args[1];
		Integer item = Integer.valueOf(args[2]);
		Double precoItem = Double.valueOf(args[3]);

		Fatura fatura = new Fatura(codigo, descricao, item, precoItem);
		System.out.println(fatura);
	}

	private static void validate(String[] args) throws Exception {
		if (args.length != 4) {
			throw new Exception("Necessário passar quatro paramêtros:\n" +
					"1. Código do produto;\n" +
					"2. Descrição do produto;\n" +
					"3. Quantidade de items;\n" +
					"4. Preço unitário.");
		}
	}
}
