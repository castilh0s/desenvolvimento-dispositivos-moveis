
public class CalculadoraTeste {
	public static void main(String[] args) throws Exception {
		validate(args);

		Integer valueA = Integer.valueOf(args[0]);
		Integer valueB = Integer.valueOf(args[1]);

		Calculadora calculadora = new Calculadora(valueA, valueB);
		System.out.println(calculadora);
	}

	private static void validate(String[] args) throws Exception {
		if (args.length != 2) {
			throw new Exception("Necessário passar dois valores inteiros como paramêtro.");
		}
	}
}
