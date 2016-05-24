package br.pro.delfino.drogria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class itemVenda extends GenericDomain {

	@Column(nullable = false)
	private Short quantidade;
	@Column(nullable = false, precision = 7, scale = 2) // 99.999,99
	private BigDecimal valorParcial;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Produto produto;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Venda venda;
	@JoinColumn(nullable = false)
	private Funcionario funcionario;
	
	
	
	public Short getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorParcial() {
		return valorParcial;
	}
	public void setValorParcial(BigDecimal valorParcial) {
		this.valorParcial = valorParcial;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	

}
