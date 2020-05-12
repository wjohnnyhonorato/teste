package modelo;

public class ContaCorrente {
	
	private int saldo;
	private Cliente titularCliente;
	
	//////////////////////////////////////////////////////////////////////
	
	public String getAll() {
		return saldo + "\n" + titularCliente.getAll();
	}
	
	public void setAll(int saldo, Cliente titularCliente) {
		this.saldo = saldo;
		this.titularCliente = titularCliente;
	}
	
	/////////////////////////////////////////////////////////////////////
	
	public ContaCorrente(int saldo, Cliente titularCliente) {
		super();
		this.saldo = saldo;
		this.titularCliente = titularCliente;
	}

	public ContaCorrente() {
		super();
	}
	
		
	////////////////////////////////////////////////////////////////////
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitularCliente() {
		return titularCliente;
	}
	public void setTitularCliente(Cliente titularCliente) {
		this.titularCliente = titularCliente;
	}

	
	
	//////////////////////////////////////////////////////////////////////////
	
	
}
