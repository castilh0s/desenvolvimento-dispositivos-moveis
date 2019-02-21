public class PopulacaoMundial {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Necessário passar um valor númerico como parâmetro");
      System.exit(0);
    }

    Long POPULACAO_ATUAL = 7000000000L;
    Double TAXA_CRESCIMENTO = 1.2;

    Integer ano = Integer.valueOf(args[0]);

    Long populacaoFinal = Math.round(POPULACAO_ATUAL * Math.pow((1 + (TAXA_CRESCIMENTO / 100)), ano));

    System.out.println(populacaoFinalLong + " pessoas");
  }
}