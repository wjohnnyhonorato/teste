package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {
		
		Aluno objetoAluno = new Aluno();
		Endereco objetoEndereco = new Endereco();
		
		//objetoEndereco.setAll("rua", "32A", "ANrnia", "OZ", "SP", "1212-1212");
		//objetoEndereco.setLogradouro("kkkkkkk");
		
		objetoAluno.adicionarNome(JOptionPane.showInputDialog("digite o nome").toUpperCase());
		objetoAluno.adicionarMatricula(Integer.parseInt(JOptionPane.showInputDialog ("\n digite a matricula \n")));
		objetoAluno.adicionarEmail(JOptionPane.showInputDialog("digite o email").toUpperCase());
		
		System.out.println("O nome e: " + objetoAluno.retornarNome());
		System.out.println("A matricula e: " + objetoAluno.retornarMatricula());
		System.out.println("O email e: " + objetoAluno.retornarEmail());
		
		//objetoAluno.setAll("bruno",445577, "@hotmail", objetoEndereco);
	
		
		//System.out.println(objetoAluno.getAll());
		
		
		System.out.println("Ate logo...");
		
		int y[] = new int [10];
		y[0] = 12;
		y[1] = 13;
	}
	
}
