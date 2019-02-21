
public class TriangulosTeste {
  public static void main(String[] args) {
    if (args.length != 2) {
			System.out.println("Necessário passar o tipo do triângulo e o tamanho do mesmo como parâmetro");
			System.exit(0);
    }

    String tipoTriangulo = args[0].toLowerCase();
    Integer tamanhoTriangulo = Integer.valueOf(args[1]);

    switch (tipoTriangulo) {
      case "a":
        trianguloA(tamanhoTriangulo);
        break;
      case "b":
        trianguloB(tamanhoTriangulo);
        break;
      case "c":
        trianguloC(tamanhoTriangulo);
        break;
      case "d":
        trianguloD(tamanhoTriangulo);
        break;
      default:
        break;
    }
  }

  private static void trianguloA(Integer tamanhoTriangulo) {
    for (Integer i = 1; i <= tamanhoTriangulo; i++) {
      imprimeLinha(i, true);
    }
  }

  private static void trianguloB(Integer tamanhoTriangulo) {
    for (Integer i = tamanhoTriangulo; i > 0; i--) {
      imprimeLinha(i, true);
    }
  }

  private static void trianguloC(Integer tamanhoTriangulo) {
    for (Integer i = tamanhoTriangulo; i > 0; i--) {
      imprimeLinha((tamanhoTriangulo - i), false);
      imprimeLinha(i, true);
    }
  }

  private static void trianguloD(Integer tamanhoTriangulo) {
    for (Integer i = 1; i <= tamanhoTriangulo; i++) {
      imprimeLinha((tamanhoTriangulo - i), false);
      imprimeLinha(i, true);
    }
  }

  private static void imprimeLinha(Integer tamanho, Boolean asterisco) {
    String caracter = " ";
    if (asterisco)
      caracter = "*";

    for (int i = 0; i < tamanho; i++) {
      System.out.print(caracter);
    }

    if (asterisco)
      System.out.println();
  }
}