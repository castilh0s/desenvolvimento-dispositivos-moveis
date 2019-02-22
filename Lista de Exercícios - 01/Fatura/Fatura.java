
public class Fatura {
	private String codigo;
	private String descricao;
	private Integer item;
	private Double precoItem;

	public Fatura(String codigo, String descricao, Integer item, Double precoItem) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setItem(item);
		this.setPrecoItem(precoItem);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}

	public Double getTotalFaturado() {
		return getItem() * getPrecoItem();
	}

	@Override
	public String toString() {
		String saida = String.format("Descrição: %s\n", getDescricao());
		saida += String.format("Total: R$ %.2f", getTotalFaturado());

		return saida;
	}
}
