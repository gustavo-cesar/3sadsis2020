package aula20200413.produto;

import java.util.Calendar;

public class Produto {
	private String descricao;
	private String codigo;
	private double quantidadeEmUnidade;
	private String lote;
	private boolean podutoTemEstoque;
	private Calendar anoFrabricacao;
	private double valor;

	public String toString() {
		return "Produto[" + "codigo:" + getCodigo() + ", Descricao:" + getDescricao() + ", lote=" + getLote()
				+ ", Quantidade em unidade " + getQuantidadeEmUnidade() + " Valor por unidade:" + getValor() + " ]";

	}

	// 2.1 Um construtor padr�o;
	public Produto() {
		this.quantidadeEmUnidade = 1;
		this.podutoTemEstoque = true;

	}

	// 2.2 Um construtor alternativo;
	public Produto(String descricao, double valor, Calendar anoFrabricacao) {
		this.quantidadeEmUnidade = 1;
		setDescricao(descricao);
		setAnoFrabricacao(anoFrabricacao);
		setValor(valor);
	}

	// 2.3 Um m�todo modificador;
	public void setAnoFrabricacao(Calendar anoFrabricacao) {
		this.anoFrabricacao = anoFrabricacao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public void setQuantidadeEmUnidade(double quantidadeEmUnidade) {
		this.quantidadeEmUnidade += quantidadeEmUnidade;
	}

	public void setValor(Double valor) {
		if (valor <= 0) {
			throw new RuntimeException("Valor não pode ser menor que zero");
		}
		this.valor = valor;
	}

	public void setanoFrabricacao(Calendar anoFrabricacao) {
		this.anoFrabricacao = anoFrabricacao;
	}

	// 2.4 Um m�todo de acesso cujo retorno seja o valor de um atributo;

	public double getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getLote() {
		return lote;
	}

	public double getQuantidadeEmUnidade() {
		return quantidadeEmUnidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public Calendar getAnoFrabricacao() {
		return anoFrabricacao;
	}

	public boolean ispodutoTemEstoque() {
		return podutoTemEstoque;

	}

	// 2.5 Um m�todo de acesso cujo retorno N�O seja o valor de um atributo, mas sim
	// um valor CALCULADO em fun��o de um valor de atributo.;
	public String getDescontoAvista(double valorDesconto) {
		return "Na compra avista o valor do produto sera: R$" + calculaValorTotalAvista(this.valor, valorDesconto);
	}

	// 2.6 Um método encapsulado que seja usado pelo método de acesso do item 2.5.
	private double calculaValorTotalAvista(double valor, double valorDesconto) {
		if (valor <= 0) {
			throw new RuntimeException("O valor não pode ser 0.00 ou nulo");
		}
		if (valorDesconto > valor) {
			throw new RuntimeException("O valor de desconto não pode ser maior que o valor do produto");
		}
		return valor - valorDesconto;
	}
}
