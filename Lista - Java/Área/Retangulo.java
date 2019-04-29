
public class Retangulo implements AreaCalculavel {
	private Double comprimento;
	private Double largura;

	public Retangulo(Double comprimento, Double largura) {
		this.setComprimento(comprimento);
		this.setLargura(largura);
	}

	@Override
	public Double calcularArea() {
		return getComprimento() * getLargura();
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	@Override
	public String toString() {
		return "Área do retângulo: " + calcularArea();
	}
}
