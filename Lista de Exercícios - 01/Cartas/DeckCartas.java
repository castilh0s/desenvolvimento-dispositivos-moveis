import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckCartas {
    private List<Carta> monte;

    private final Integer TOTAL_DE_CARTAS = 52;
    private final List<String> VALORES = Arrays.asList("Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete",
            "Rainha", "Rei");
    private final List<String> NAIPES = Arrays.asList("Paus", "Ouros", "Copas", "Espadas");

    public DeckCartas() {
        this.monte = new ArrayList<Carta>(TOTAL_DE_CARTAS);

        NAIPES.forEach(naipe -> {
            VALORES.forEach(valor -> {
                Carta carta = new Carta(naipe, valor);
                monte.add(carta);
            });
        });
    }

    public void embaralhar() {
        Collections.shuffle(monte);
    }

    public Carta distribuir() {
        try {
            Carta carta = this.monte.get(0);
            monte.remove(0);

            return carta;
        } catch (Exception e) {
            throw new RuntimeException("Nenhuma carta no baralho! Fim de jogo!");
        }
    }

    public List<Carta> getMonte() {
        return monte;
    }
}
