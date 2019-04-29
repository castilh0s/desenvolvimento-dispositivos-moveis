import java.util.Arrays;
import java.util.List;

public class AreaTeste {
	public static void main(String[] args) {
		List<AreaCalculavel> formas = Arrays.asList(
      new Circulo(3.0),
      new Triangulo(2.0, 3.0),
      new Retangulo(4.5, 3.2)
		);

		formas.forEach(objeto -> System.out.println(objeto));
	}
}
