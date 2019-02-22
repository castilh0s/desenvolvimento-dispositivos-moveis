import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Triangulos {
	private String tipoTriangulo;
	private Integer tamanhoTriangulo;
	private String triangle;

	public Triangulos(String tipoTriangulo, Integer tamanhoTriangulo) {
		this.setTipoTriangulo(tipoTriangulo);
		this.setTamanhoTriangulo(tamanhoTriangulo);
	}

	public String getTipoTriangulo() {
		return tipoTriangulo;
	}

	public void setTipoTriangulo(String tipoTriangulo) {
		this.tipoTriangulo = tipoTriangulo;
	}

	public Integer getTamanhoTriangulo() {
		return tamanhoTriangulo;
	}

	public void setTamanhoTriangulo(Integer tamanhoTriangulo) {
		this.tamanhoTriangulo = tamanhoTriangulo;
	}

	public String getTriangle() {
		return triangle;
	}

	public void setTriangle(String triangle) {
		this.triangle = triangle;
	}

	public void trianguloA() {
		String triangle = "";
		for (Integer i = 1; i <= getTamanhoTriangulo(); i++) {
			triangle += createLine(i, "*") + "\n";
		}
		setTriangle(triangle);
	}

	public void trianguloB() {
    String triangle = "";
		for (Integer i = getTamanhoTriangulo(); i > 0; i--) {
      triangle += createLine(i, "*") + "\n";
    }
		setTriangle(triangle);
	}

	public void trianguloC() {
    String triangle = "";
		for (Integer i = getTamanhoTriangulo(); i > 0; i--) {
			triangle += createLine((getTamanhoTriangulo() - i), " ");
			triangle += createLine(i, "*") + "\n";
    }
    setTriangle(triangle);
	}

	public void trianguloD() {
    String triangle = "";
		for (Integer i = 1; i <= getTamanhoTriangulo(); i++) {
			triangle += createLine((getTamanhoTriangulo() - i), " ");
			triangle += createLine(i, "*") + "\n";
    }
    setTriangle(triangle);
	}

	private String createLine(Integer length, String character) {
		return IntStream.range(0, length)
				.mapToObj(i -> character)
				.collect(Collectors.joining(""));
  }

  @Override
	public String toString() {
		return getTriangle();
	}
}
