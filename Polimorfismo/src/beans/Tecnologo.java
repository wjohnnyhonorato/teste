package beans;

public class Tecnologo extends Formacao{
	
	private boolean planoEstendido;
	
	////////////////////////////////////////////////////qq

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	/////////////////////////////////////////// cosntrutores
	
	public Tecnologo(String descricao, int periodo, Double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo() {
		super();
	}
	
	////////////////////////////////////// getAll setAll
	
	public void setAll(String descricao, int periodo, Double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public String getAll() {
		return planoEstendido + "\n" + super.getAll();
	}
	
	///////////////////////////////// metodos gerais
	
	public void calcularMensalidade (double fator) {
		 super.setMensalidade(super.getDuracao()*fator*600);
	}

}
