package json;

public class Fatura {
	private String codigo;
	private String descricao;
	private Integer quantidade;
	private Double preco;
	
	public Fatura(String codigo, String descricao, Integer quantidade, Double preco) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setQuantidade(quantidade);
		this.setPreco(preco);
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getTotalItem() {
		return getQuantidade() * getPreco();
	}
}
