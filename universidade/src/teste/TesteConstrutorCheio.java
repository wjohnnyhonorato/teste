package teste;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Professor;

public class TesteConstrutorCheio {
	
	public static String s(String msg){
		return JOptionPane.showInputDialog(msg);
	}

	public static void main(String[] args) {
		
		
		
	//Professor objetoProfessor = new Professor("Madruga", "madruguinha", "filosofia",new Endereco("X", "1A", "bla", "sao paulo", "SP","rere") );
	//System.out.println(objetoProfessor.getAll());
		
	/* Professor objetoProfessor = new Professor(
			JOptionPane.showInputDialog("digite o nome"), 
			JOptionPane.showInputDialog("digite apelido"), 
			JOptionPane.showInputDialog("digitea materia"),
			new Endereco(
					JOptionPane.showInputDialog("digite o logradouro"), 
					JOptionPane.showInputDialog("digite o numero"), 
					JOptionPane.showInputDialog("digite o cidade"), 
					JOptionPane.showInputDialog("digite o cidade"), 
					JOptionPane.showInputDialog("digite o uf"),
					JOptionPane.showInputDialog("digite o capital")) ); */
		
		Professor objetoProfessor = new Professor(
				s("digite o nome"), 
				s("digite apelido"), 
				s("digitea materia"),
				new Endereco(
						s("digite o logradouro"), 
						s("digite o numero"), 
						s("digite o cidade"), 
						s("digite o cidade"), 
						s("digite o uf"),
						s("digite o capital")) );
	
	
	System.out.println(objetoProfessor.getAll());
	}
}
