package br.com.itau.beans.implementacao;

import javax.swing.JOptionPane;

import br.com.itau.beans.modelo.CompactDisc;
import br.com.itau.beans.modelo.Livro;
import br.com.itau.beans.modelo.Produto;

public class Teste2 {
	
	
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
		
				
		Produto produto = null;
		String resposta = JOptionPane.showInputDialog("digite: \n <L> para livro ou \n <C> para CD").toUpperCase();
		
		if (resposta.contentEquals("L")) {
			produto = new Livro(
					inteiro("\n insira o codigo \n"),
					decimal("\n insira o valoro \n"),
					texto("insira a descricao "),
					texto("insira o ISBN "),
					texto("insira o Autor"));
		
		} 
		else if (resposta.contentEquals("C")) {
			produto = new CompactDisc(
					
					inteiro ("\n insira o codigo \n"),
					decimal ("\n insira o valoro \n"),
					texto ("insira a descricao "),
					texto ("insira o ISBN "),
					texto ("insira o Autor"));
		}
		else {
						
			System.out.println("Opacao invalida");
		}	
			
		System.out.println("\n" + produto.calcularValorFinal());	
	}
	 

}
