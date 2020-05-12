package modelo;

public class Endereco {
	
	///////////////////////////////////////////////////////
	private String logradouro;
	private String numero;
	private String bairro; 
	private String cidade;
	private String uf;
	private String capital;
	///////////////////////////////////////////////////////
	
	public Endereco() {
		super();
	}
    
	public Endereco(String logradouro, String numero, String bairro, String cidade, String uf, String capital) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.capital = capital;
	}

	
	//////////////////////////////////////////////////////////
	
	public String getAll() {
		return logradouro + "\n" + numero +"\n" + bairro + "\n" + cidade + "\n" + uf + "\n" + capital;
	}
	
	
	
	public void setAll(String logradouro, String numero, String bairro, String cidade, String uf, String capital) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.capital = capital;
		
	}
	
	////////////////////////////////////////////////////////////
	
	//////////////////////////////////////////////////////////
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro.toUpperCase();
	}
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if(uf.length()==2) {
		this.uf = uf;
		}
		else {
			this.uf =null;	
		}
	}
	
	
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	} 
	
	/////////////////////////////////////////////////////////////////////////////////

}
