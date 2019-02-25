
public class PopulacaoMundialTeste {
	public static void main(String[] args) throws Exception {
		validate(args);

		Integer ano = Integer.valueOf(args[0]);

		PopulacaoMundial populacaoMundial = new PopulacaoMundial(ano);
		System.out.println(populacaoMundial);
	}

	private static void validate(String[] args) throws Exception {
		if (args.length != 1) {
			throw new Exception("Necessário passar um parâmetro:\n" +
					"1. Anos");
		}
	}
}
