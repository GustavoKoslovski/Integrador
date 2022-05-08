package model;

public class Produto extends AbstractEntity {

	private long idProduto;
    private String nomeProduto;
    private long codigoDeBarras;
    private Double valorCusto;
    private Double valorVenda;
    private Boolean disponivel;
	private long idCategoria;
    private long idFornecedor;

    public Produto() {
    }

    
    public Produto(long idProduto, String nomeProduto, long quantProduto, long codigoDeBarras, Double valorCusto,
			Double valorVenda, Boolean disponivel, long idCategoria, long idFornecedor) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.codigoDeBarras = codigoDeBarras;
		this.valorCusto = valorCusto;
		this.valorVenda = valorVenda;
		this.disponivel = disponivel;
		this.idCategoria = idCategoria;
		this.idFornecedor = idFornecedor;
	}


	public long getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}





	public long getCodigoDeBarras() {
		return codigoDeBarras;
	}


	public void setCodigoDeBarras(long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}


	public Double getValorCusto() {
		return valorCusto;
	}


	public void setValorCusto(Double valorCusto) {
		this.valorCusto = valorCusto;
	}


	public Double getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}


	public Boolean getDisponivel() {
		return disponivel;
	}


	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}


	public long getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}


	public long getIdFornecedor() {
		return idFornecedor;
	}


	public void setIdFornecedor(long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}


	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", codigoDeBarras=" + codigoDeBarras
				+ ", valorCusto=" + valorCusto + ", valorVenda=" + valorVenda + ", disponivel=" + disponivel
				+ ", idCategoria=" + idCategoria + ", idFornecedor=" + idFornecedor + "]";
	}



}

