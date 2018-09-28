package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido implements Serializable {

	@ManyToOne @JoinColumn(name="idCliente")
	
	private Cliente cliente;
	
	@Id
	private int idPedido;
	@Column
	private int idCliente;
	@Column
	private String produto;
	@Column 
	private int qtd;
	@Column
	private Double vlr_unitario;
	@Column
	private Double preco_total;
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Double getVlr_unitario() {
		return vlr_unitario;
	}
	public void setVlr_unitario(Double vlr_unitario) {
		this.vlr_unitario = vlr_unitario;
	}
	public Double getPreco_total() {
		return preco_total;
	}
	public void setPreco_total(Double preco_total) {
		this.preco_total = preco_total;
	}
	
	
	
	
	
}
