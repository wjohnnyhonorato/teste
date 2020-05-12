package br.com.itau.beans.modelo;

public class CompactDisc extends Produto { // Aqui vc define que CompactDisc herda as caracteristicas de Produto
	
	String gravadora;
	String artista;

	
	///////////////////////////////////// metodos getters setters

	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
	///////////////////////////////////////// metodos construtores vazio e cheio
	
	public CompactDisc(int codigo, double preco, String descricao, String gravadora, String artista) {
		super(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	public CompactDisc() {
		super();
	}
	//////////////////////////////////////// metodos setAll getAll
	
	public void setAll (int codigo, double preco, String descricao, String gravadora, String artista) {
		super.setAll(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	public String getAll() {
		return gravadora + "\n" + artista + "\n" + super.getAll();
	}
	
	//////////////////////////////////////// outros metodos
	
	public Double calcularValorFinal() {
		double valorimp = super.getPreco()*1.15;
		return valorimp ;
	}
}   

