
public class CartasTeste {
	public static void main(String[] args) {
		DeckCartas deck = new DeckCartas();

		System.out.println("Embaralhando o deck!");
		deck.embaralhar();
		for (int i = 0; i < deck.getTOTAL_DE_CARTAS(); i++) {
			System.out.println("Distribuindo " + deck.distribuir());
		}
		System.out.println("Nenhuma carta no baralho! Fim de jogo!");
	}
}
