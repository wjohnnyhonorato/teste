package br.com.itau.beans.modelo;

public abstract class Produto {
	
	private int codigo;
	private double preco;
	private String descricao;
	
	public Double calcularValorFinal () {
		return preco;
	}

	
	////////////////////////////////////// getters setters
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	///////////////////////////////////////////// metodos construtores
	
	public Produto(int codigo, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}
	public Produto() {
		super();
	}
	////////////////////////////////////////////// getters setters
	
	public void setAll (int codigo, double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}
	public String getAll() {
		return codigo + "\n" + preco + "\n" + descricao;
	}
	
}
