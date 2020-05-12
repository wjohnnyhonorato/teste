
public class Fila {

	private int ini;
	private int fim;
	private int vetor[];
	private int total;
	
	
	public Fila () {
		vetor = new int[10];
		ini=-1;
		fim=-1;
	}
	
	public boolean vazio () {
		return total==0;
	}
	
	public boolean cheio () {
		return total==9;
	}
	
	public void inserir(int valor) {
		if (cheio() != true) {
			fim++;
			vetor[fim]=valor;
			total++;
		}
	}
	
	public int atender () {
		if (vazio() != true) {
			ini++;
			int valor = vetor[ini];
			total--;
			return valor;
		}
		else {
			return 0;
		}
	}
}
