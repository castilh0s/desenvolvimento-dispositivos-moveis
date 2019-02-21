
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
    System.out.println("Triângulo A de tamanho: " + tamanhoTriangulo);
  }

  private static void trianguloB(Integer tamanhoTriangulo) {
    System.out.println("Triângulo B de tamanho: " + tamanhoTriangulo);
  }

  private static void trianguloC(Integer tamanhoTriangulo) {
    System.out.println("Triângulo C de tamanho: " + tamanhoTriangulo);
  }

  private static void trianguloD(Integer tamanhoTriangulo) {
    System.out.println("Triângulo D de tamanho: " + tamanhoTriangulo);
  }
}