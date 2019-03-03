import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckCartas {
	private List<Carta> monte = new ArrayList<Carta>();
	private Integer cartaAtual;
	private final Integer TOTAL_DE_CARTAS = 52;
	private final List<String> VALORES = Arrays.asList("Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete",
			"Rainha", "Rei");
	private final List<String> NAIPES = Arrays.asList("Paus", "Ouros", "Copas", "Espadas");

	public DeckCartas() {
		for (int i = 0; i < getTOTAL_DE_CARTAS(); i++) {
			Integer naipe = i / getVALORES().size();
			Integer valor = i % getVALORES().size();

			Carta carta = new Carta(getNAIPES().get(naipe), getVALORES().get(valor));
			monte.add(carta);
		}
	}

	public void embaralhar() {
		Collections.shuffle(monte);
	}

	public Carta distribuir() {
		if (getCartaAtual() == null)
			setCartaAtual(getMonte().size() - 1);
		try {
			Carta carta = getMonte().get(getCartaAtual());
			this.monte.remove(carta);
			setCartaAtual(getCartaAtual() - 1);

			return carta;
		} catch (Exception e) {
			throw new RuntimeException("Nenhuma carta no baralho! Fim de jogo!");
		}
	}

	public List<Carta> getMonte() {
		return monte;
	}

	public Integer getCartaAtual() {
		return cartaAtual;
	}

	public void setCartaAtual(Integer cartaAtual) {
		this.cartaAtual = cartaAtual;
	}

	public Integer getTOTAL_DE_CARTAS() {
		return TOTAL_DE_CARTAS;
	}

	public List<String> getVALORES() {
		return VALORES;
	}

	public List<String> getNAIPES() {
		return NAIPES;
	}
}
