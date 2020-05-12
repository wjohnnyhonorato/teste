package beans;

public class Medio extends Formacao{
	private String tipo;
	////////////////////////////////////////////////// getters setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/////////////////////////////////////////////////////// construtores
	public Medio(String descricao, int periodo, Double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public Medio() {
		super();
	}
	//////////////////////////////////// getAll setAll
	
	public void setAll (String descricao, int periodo, Double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public String getAll() {
		return tipo +"\n" + super.getAll();
	}
	
	///////////////////////////////// metodos gerais
	public void calcularMensalidade (double fator) {
		super.setMensalidade(super.getDuracao()*fator*500);
	}

}
