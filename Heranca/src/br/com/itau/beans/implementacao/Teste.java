package br.com.itau.beans.implementacao;

import javax.swing.JOptionPane;

import br.com.itau.beans.modelo.CompactDisc;
import br.com.itau.beans.modelo.Livro;

public class Teste {
	
	
	public static String texto (String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int inteiro (String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static Double decimal (String msg) {
		return Double.parseDouble(texto(msg));
	}
	
	public static void main(String args[]) {
		
		
		
		CompactDisc cd = new CompactDisc();
		Livro livro = new Livro();
		String resposta = JOptionPane.showInputDialog("digite: \n <L> para livro ou \n <C> para CD").toUpperCase();
		
		if (resposta.contentEquals("L")) {
			
			livro.setAll(
					inteiro("\n insira o codigo \n"),
					decimal("\n insira o valoro \n"),
					texto("insira a descricao "),
					texto("insira o ISBN "),
					texto("insira o Autor"));
			System.out.println("\n" + livro.getAll());
		} 
		else if (resposta.contentEquals("C")) {
			cd.setAll(
					inteiro ("\n insira o codigo \n"),
					decimal ("\n insira o valoro \n"),
					texto ("insira a descricao "),
					texto ("insira o ISBN "),
					texto ("insira o Autor"));
			System.out.println("\n" + cd.getAll());
		}
		else {
						
			System.out.println("Opacao invalida");
		}	
			
			
	}
	 

}
