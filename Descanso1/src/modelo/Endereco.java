package modelo;

public class Endereco {
	
	///////////////////////////////////////////////////////
	private String rua;
	private int numero;
	private String complemento; 
	private String bairro;
	private String cep;
	///////////////////////////////////////////////////////
	
	public Endereco(String rua, int numero, String complemento, String bairro, String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

	public Endereco() {
		super();
	}
	
	//////////////////////////////////////////////////////////
	
	public String getAll() {
		return rua + "\n" + numero +"\n" + complemento + "\n" + bairro + "\n" + cep;
	}
	
	public void setAll(String rua, int numero, String complemento, String bairro, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		
	}
   
	///////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}


	   
	
	/////////////////////////////////////////////////////////////////////////////////

}
