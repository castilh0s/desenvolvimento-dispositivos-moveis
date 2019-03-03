package json;

public class Itens {
	private Fatura[] itens;

	public Itens(Fatura[] itens) {
		setItens(itens);
	}

	public Fatura[] getItens() {
		return itens;
	}

	public void setItens(Fatura[] itens) {
		this.itens = itens;
	}

	public Double getTotalFatura() {
		Double totalFatura = 0.0;

		for (Fatura f : getItens()) {
			totalFatura += f.getPreco();
		}

		return totalFatura;
	}

	@Override
	public String toString() {
		String output = String.format("Total das faturas: R$ %.2f (%d faturas)", getTotalFatura(), getItens().length);

		return output;
	}
}
