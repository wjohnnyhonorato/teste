package modelo;

public class Aluno {
	
	///////////////////////////////////////////////////////////////////////
	private String nome;
	private int numeroMatricula;
	private String email; 
	private Endereco endereco;
	
	///////////////////////////////////////////////////////////////////////
	
	// cronstrutor vazio
	public Aluno () {}
	// construtor cheio
	public Aluno (int numeroMatricula, String nome, String email, Endereco endereco) {
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}
	/////////////////////////////////////////////////////////////////////////////////
	
	
	public String getAll() {
		return nome + "\n" + numeroMatricula +"\n" + email + "\n" +endereco.getAll();
	}
	
	public void setAll(String nome, int numeroMatricula, String email, Endereco endereco) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		this.email = email;
		this.endereco = endereco;
	}
	
	
	public void adicionarNome(String pNome) {
	nome = pNome;	
	}
	public String retornarNome() {
		return nome;
	}
	
	
	public void adicionarMatricula(int pMatricula) {
		numeroMatricula = pMatricula;	
	}   
	public int retornarMatricula() {
		return numeroMatricula;
	}
	
	
	public void adicionarEmail(String pEmail) {
		email = pEmail;	
	}   
	public String retornarEmail() {
		return email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
