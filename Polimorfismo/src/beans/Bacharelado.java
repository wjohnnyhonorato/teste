package beans;

import Interface.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao {
	
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	///////////////////////////////////// getters setters
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	//////////////////////////////////// construtores
	public Bacharelado(String descricao, int periodo, Double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public Bacharelado() {
		super();
	}
	
	/////////////////////////////////////// getAll setAll
	
	public void setAll(String descricao, int periodo, Double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getAll() {
		return projetoConclusao + "\n" + cargaHorariaEstagio +"\n" + super.getAll();
	}
	///////////////////////////////// metodos gerais
		
	public void calcularMensalidade (double fator) {
		super.setMensalidade(super.getDuracao()*fator*600 + cargaHorariaEstagio*12);
	}


}
