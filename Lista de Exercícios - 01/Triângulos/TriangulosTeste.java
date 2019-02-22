
public class TriangulosTeste {
	public static void main(String[] args) {
		validate(args);

		String tipoTriangulo = args[0].toLowerCase();
		Integer tamanhoTriangulo = Integer.valueOf(args[1]);

		Triangulos triangulo = new Triangulos(tipoTriangulo, tamanhoTriangulo);

		switch (triangulo.getTipoTriangulo()) {
		case "a":
			triangulo.trianguloA();
			break;
		case "b":
			triangulo.trianguloB();
			break;
		case "c":
			triangulo.trianguloC();
			break;
		case "d":
			triangulo.trianguloD();
			break;
		default:
			break;
		}

    System.out.print(triangulo);
  }

	private static void validate(String[] args) {
		if (args.length != 2) {
			System.out.println("Necessário passar o tipo do triângulo e o tamanho do mesmo como parâmetro");
			System.exit(0);
		}
	}
}
