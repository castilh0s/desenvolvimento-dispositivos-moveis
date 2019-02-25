
public class Retangulo {
	private Double sideA = 1.0;
	private Double sideB = 1.0;

	public Retangulo(Double sideA, Double sideB) throws Exception {
		this.setSideA(sideA);
		this.setSideB(sideB);
	}

	public Double getSideA() {
		return sideA;
	}

	public void setSideA(Double sideA) throws Exception {
		if (sideA > 0)
			this.sideA = sideA;
		else
			throw new Exception("Número inválido, necessário passar valor maior que 0");
	}

	public Double getSideB() {
		return sideB;
	}

	public void setSideB(Double sideB) throws Exception {
		if (sideB > 0)
			this.sideB = sideB;
		else
			throw new Exception("Número inválido, necessário passar valor maior que 0");
	}

	public Double getArea() {
		return getSideA() * getSideB();
	}

	public Double getPerimeter() {
		return (2 * getSideA()) + (2 * getSideB());
	}

	@Override
	public String toString() {
		String out = String.format("Área: %.2f\n", getArea());
		out += String.format("Perímetro: %.2f", getPerimeter());

		return out;
	}
}
