
public class Calculadora {
	private Integer valueA;
	private Integer valueB;

	public Calculadora(Integer valueA, Integer valueB) {
		this.setValueA(valueA);
		this.setValueB(valueB);
	}

	private Integer getValueA() {
		return valueA;
	}

	private void setValueA(Integer valueA) {
		this.valueA = valueA;
	}

	private Integer getValueB() {
		return valueB;
	}

	private void setValueB(Integer valueB) {
		this.valueB = valueB;
	}

	private Integer getAddition() {
		return getValueA() + getValueB();
	}

	private Integer getSubtraction() {
		return getValueA() - getValueB();
	}

	private Integer getMultiplication() {
		return getValueA() * getValueB();
	}

	private Double getDivision() {
		return (double) getValueA() / (double) getValueB();
	}

	private String greaterValue() {
		if (getValueA() > getValueB())
			return String.format("%d é o maior.", getValueA());
		else if (getValueB() > getValueA())
			return String.format("%d é o maior", getValueB());
		else
			return String.format("Esses números são iguais.");
	}

	@Override
	public String toString() {
		String saida = String.format("Soma: %d\n", getAddition());
		saida += String.format("Produto: %d\n", getMultiplication());
		saida += String.format("Diferença: %d\n", getSubtraction());
		saida += String.format("Divisão: %.2f\n", getDivision());
		saida += greaterValue();

		return saida;
	}
}
