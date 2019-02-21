public class Calculadora {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Necessário passar dois valores inteiros como parâmetro");
			System.exit(0);
		}

		Integer valorA = Integer.valueOf(args[0]);
		Integer valorB = Integer.valueOf(args[1]);

		Integer soma = soma(valorA, valorB);
		Integer produto = produto(valorA, valorB);
		Integer diferenca = diferenca(valorA, valorB);
		Double divisao = divisao((double) valorA, (double) valorB);
		String maiorValor = maiorValor(valorA, valorB);

		print(soma, produto, diferenca, divisao, maiorValor);
	}

	private static void print(Integer soma, Integer produto, Integer diferenca, Double divisao, String maiorValor) {
		System.out.println("Soma: " + soma + "\n" +
				"Produto: " + produto + "\n" +
				"Diferença: " + diferenca + "\n" +
				"Divisão: " + divisao + "\n" +
				maiorValor);
	}

	private static Integer soma(Integer valorA, Integer valorB) {
		return valorA + valorB;
	}

	private static Integer produto(Integer valorA, Integer valorB) {
		return valorA * valorB;
	}

	private static Integer diferenca(Integer valorA, Integer valorB) {
		return valorA - valorB;
	}

	private static Double divisao(Double valorA, Double valorB) {
		return valorA / valorB;
	}

	private static String maiorValor(Integer valorA, Integer valorB) {
		if (valorA > valorB)
			return (valorA + " é maior");
		else if (valorB > valorA)
			return (valorB + " é maior");
		else
			return "Esses números são iguais";
	}
}