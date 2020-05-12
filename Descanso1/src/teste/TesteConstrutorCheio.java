package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Endereco;

public class TesteConstrutorCheio {

	public static void main(String[] args) {
		
		Cliente objetoCliente = new Cliente();
		
		Endereco objetoEndereco = new Endereco();
		
		ContaCorrente contaCorrente = new ContaCorrente(
				500,
				new Cliente(
						"xpto",
						"12132",
						new Endereco (
							"rua",
							14,
							"apt",
							"centro",
							"9596969"
								)
						)
				
				);
				
			
		
		System.out.println(contaCorrente.getAll());
		
		
	}
	
}