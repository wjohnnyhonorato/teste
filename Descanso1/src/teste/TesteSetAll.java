package teste;

import modelo.Cliente;
import modelo.Endereco;

public class TesteSetAll {

	public static void main(String[] args) {
		
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		
		//objetoEndereco.setAll("rua", "32A", "ANrnia", "OZ", "SP", "1212-1212");
		//objetoEndereco.setLogradouro("kkkkkkk");
		
		
		
		//objetoEndereco.setBairro("kkkkkkk");
		
		//objetoAluno.adicionarNome(JOptionPane.showInputDialog("digite o nome").toUpperCase());
		//objetoAluno.adicionarMatricula(Integer.parseInt(JOptionPane.showInputDialog ("\n digite a matricula \n")));
		//objetoAluno.adicionarEmail(JOptionPane.showInputDialog("digite o email").toUpperCase());
		
	
		objetoEndereco.setAll("rua", 32, "bloco", "inamar", "0044-56");
		objetoCliente.setAll("bruno","@hotmail", objetoEndereco);
	
		//objetoAluno.setAll("bruno",445577, "@hotmail", objetoEndereco);
		
		//System.out.println(objetoEndereco.getAll());
		System.out.println(objetoCliente.getAll());
		
		//System.out.println("O nome e: " + objetoAluno.retornarNome());
		//System.out.println("A matricula e: " + objetoAluno.retornarMatricula());
		//System.out.println("O email e: " + objetoAluno.retornarEmail());
		System.out.println(" \n Ate logo...");
	}
	
}