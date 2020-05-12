package br.com.universidade.modelo;

public class Pessoa {
	
	///////// atributos
	//////// getters setters
	/////// construtores
	/////// getlall setall
	
		private String nome;
		private String email;
		private String fone;
		
		/////////////////////////////////////////////////////////////////////////
		///  setAll getAll 
		
		public void setAll(String nome, String email, String fone) {
			this.nome = nome;
			this.email = email;
			this.fone = fone;
		}
		
		public String getAll() {
			return nome + "\n" + email + "\n" + fone;
			
		}
		
		////////////////////////////////////////////////////////////////////////
		//////construtores  
		public Pessoa(String nome, String email, String fone) {
			super();
			this.nome = nome;
			this.email = email;
			this.fone = fone;
		}


		public Pessoa() {
			super();
		}
        /////////////////////////////////////////////////////////////////////
		//// Getters e Setters

		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getFone() {
			return fone;
		}


		public void setFone(String fone) {
			this.fone = fone;
		}
		
		

}
