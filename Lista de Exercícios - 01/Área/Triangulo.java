
public class Triangulo implements AreaCalculavel {
	private Double base;
	private Double altura;

	public Triangulo(Double base, Double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	@Override
	public Double calcularArea() {
		return (getBase() * getAltura()) / 2;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Área do triângulo: " + calcularArea();
	}
}
