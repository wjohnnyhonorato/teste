package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Endereco;

public class TesteSetterIndividual {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente();
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.setSaldo(500);
		contaCorrente.setTitularCliente(cliente);
		
		cliente.setCpf("00000");
		cliente.setNome("vava");
		cliente.setEndereco(endereco);
		
		endereco.setBairro("babab");
		endereco.setCep ("babab");;
		endereco.setComplemento ("babab");;
		endereco.setNumero (3434);;
		endereco.setRua ("babab");;
		
		
		System.out.println(cliente.getAll());	
		
		
		System.out.println(" \n Ate logo...");
		
		//objetoEndereco.setAll("rua", "32A", "ANrnia", "OZ", "SP", "1212-1212");
		//objetoEndereco.setLogradouro("kkkkkkk");
		
		
		
		//objetoEndereco.setBairro("kkkkkkk");
		
		//objetoAluno.adicionarNome(JOptionPane.showInputDialog("digite o nome").toUpperCase());
		//objetoAluno.adicionarMatricula(Integer.parseInt(JOptionPane.showInputDialog ("\n digite a matricula \n")));
		//objetoAluno.adicionarEmail(JOptionPane.showInputDialog("digite o email").toUpperCase());
		
	
		
	
		//objetoAluno.setAll("bruno",445577, "@hotmail", objetoEndereco);
		
		//System.out.println(objetoEndereco.getAll());
	
		
		//System.out.println("O nome e: " + objetoAluno.retornarNome());
		//System.out.println("A matricula e: " + objetoAluno.retornarMatricula());
		//System.out.println("O email e: " + objetoAluno.retornarEmail());
		
	}
	
}