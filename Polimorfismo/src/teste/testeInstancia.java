package teste;

import javax.swing.JOptionPane;

import beans.Bacharelado;
import beans.Formacao;
import beans.Medio;
import beans.Tecnologo;

public class testeInstancia {
	
	public static void main(String args[]) {
		
		Formacao objeto = null;
		
		
		char resposta = JOptionPane.showInputDialog("QUal formacao deseja cadastrar? \n <M 1> \n <T 1> \n <B 1>").toUpperCase().charAt(0);
		
		if (resposta=='1') {
			
			objeto = new Medio(
					JOptionPane.showInputDialog("insira a descricao do curso").toUpperCase(),
					Integer.parseInt(JOptionPane.showInputDialog ("insira o periodo")),
					0,
					0,
					JOptionPane.showInputDialog("insira o tipo do curso").toUpperCase());
			System.out.println("\n" + objeto.getAll());
		} 
		else if (resposta=='2'){
			
			objeto = new Tecnologo(
					JOptionPane.showInputDialog("insira a descricao do curso").toUpperCase(),
					Integer.parseInt(JOptionPane.showInputDialog ("insira o periodo")),
					0,
					0,
					true;
			System.out.println("\n" + objeto.getAll());
		}
		else if (resposta=='3'){
					
			objeto = new Bacharelado(
					JOptionPane.showInputDialog("insira a descricao do curso").toUpperCase(),
					Integer.parseInt(JOptionPane.showInputDialog ("insira o periodo")),
					0,
					0,
					JOptionPane.showInputDialog("Projeto de conclusao do curso").toUpperCase(),
					Integer.parseInt(JOptionPane.showInputDialog ("carga horaria")));
			System.out.println("\n" + bacharelado.getAll());
		}
						
		else {
						
			System.out.println("Opacao invalida");
		}	
		objeto.definirDuracao();
		objeto.CalcularMensalidade();
		System.out.println(objeto.getAll)
	}

}
