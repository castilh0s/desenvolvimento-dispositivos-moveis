
public class PopulacaoMundial {
	private Long POPULACAO_ATUAL = 7000000000L;
	private Double TAXA_CRESCIMENTO = 1.2;
	private Integer ano;

	public PopulacaoMundial(Integer ano) {
		this.setAno(ano);
	}

	public Long getPOPULACAO_ATUAL() {
		return POPULACAO_ATUAL;
	}

	public Double getTAXA_CRESCIMENTO() {
		return TAXA_CRESCIMENTO;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Long getPopulacaoFinal() {
		return Math.round(getPOPULACAO_ATUAL() * Math.pow((1 + (getTAXA_CRESCIMENTO() / 100)), getAno()));
	}

	@Override
	public String toString() {
		String saida = String.format("%d pessoas.", getPopulacaoFinal());
		return saida;
	}
}
