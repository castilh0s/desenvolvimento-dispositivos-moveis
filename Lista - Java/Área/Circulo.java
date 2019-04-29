
public class Circulo implements AreaCalculavel {
	private Double raio;

	public Circulo(Double raio) {
		setRaio(raio);
	}

	@Override
	public Double calcularArea() {
		return 3.14 * Math.pow(getRaio(), 2);
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Área do círculo: " + calcularArea();
	}
}
