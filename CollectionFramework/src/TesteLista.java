
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {
	public static void main (String[] args) {
		//List lista = new List(); n�o � possivel criar diretamente pois List � uma interface
		
		// pode ser feito mas n�o � recomendado, pois o objeto fica fixo como array
		//ArrayList lista = new ArrayList();
		
		List <String> lista = new ArrayList<>();
		lista.add("ds");
		lista.add("xpto");
		lista.add("aa");
		Collections.sort(lista);
		
		System.out.println(lista);
	}

}
