package projetoPilha;

public class Teste {
	public static void main (String[] args) {
	
	Pilha idades = new Pilha();
	System.out.println(idades.cheio());
	System.out.println(idades.vazio());
	
	idades.retirar();
	
	
	System.out.println(idades.retirar());
	
	idades.inserir(12);
	idades.inserir(5);
	idades.inserir(44);
	idades.inserir(53);
	idades.inserir(16);
	idades.retirar();
	
	
	System.out.println(idades.retirar());
		
	}
	
}
