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
			triangle += printLine(i, "*") + "\n";
		}
		setTriangle(triangle);
	}

	public void trianguloB() {
    String triangle = "";
		for (Integer i = getTamanhoTriangulo(); i > 0; i--) {
      triangle += printLine(i, "*") + "\n";
    }
		setTriangle(triangle);
	}

	public void trianguloC() {
    String triangle = "";
		for (Integer i = getTamanhoTriangulo(); i > 0; i--) {
			triangle += printLine((getTamanhoTriangulo() - i), " ");
			triangle += printLine(i, "*") + "\n";
    }
    setTriangle(triangle);
	}

	public void trianguloD() {
    String triangle = "";
		for (Integer i = 1; i <= getTamanhoTriangulo(); i++) {
			triangle += printLine((getTamanhoTriangulo() - i), " ");
			triangle += printLine(i, "*") + "\n";
    }
    setTriangle(triangle);
	}

	private String printLine(Integer tamanho, String caracter) {
		return IntStream.range(0, tamanho)
				.mapToObj(i -> caracter)
				.collect(Collectors.joining(""));
  }

  @Override
	public String toString() {
		return getTriangle();
	}
}
