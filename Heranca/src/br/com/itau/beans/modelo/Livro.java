package br.com.itau.beans.modelo;

public class Livro extends Produto { // Aqui vc define que Livro herda as caracteristicas de Produto
	
	private String isbn;
	private String autor;
	
	/////////////////////////////////////////// metodos getters setters
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	///////////////////////////////////////// metodos construtores
	
	public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	public Livro() {
		super();
	}
	///////////////////////////////////////// getAll setAll	
	
	public void setAll(int codigo, double preco, String descricao, String isbn, String autor) {
		super.setAll(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public String getAll() {
		return isbn + "\n" + autor + "\n" + super.getAll();
	}

    /////////////////////////////////// outros metodos

	public Double calcularValorFinal() {
		Double valorimp = super.getPreco()*1.05;
		return  valorimp ;
	}
}   
     
