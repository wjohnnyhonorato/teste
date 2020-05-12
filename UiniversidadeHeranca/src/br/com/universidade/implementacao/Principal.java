package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Pessoa;
import br.com.universidade.modelo.Professor;


public class Principal {
	
	public static void main(String args[]) {
	
		
	Aluno aluno = new Aluno("William","@hotmail","86864545",12341256,"pai");
	System.out.println("\n" + aluno.getAll());
	
	
	//Pessoa pessoa = new Pessoa("bete","@gmail","40593434");
	//System.out.println("\n" + pessoa.getAll());
	
	Professor professor = new Professor("vava","@yahoo","40555555","va","matematica");
	System.out.println("\n" + professor.getAll());
	
	}
}
