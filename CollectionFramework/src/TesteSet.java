import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {
	
		public static void main (String[] args) {
		
			Set lista = new HashSet	();
			lista.add("ds");
			lista.add("xpto");
			lista.add("vv");
			
			// n�o funciona para set pois n�o tem posi��o fixa de memoria : Collections.sort(lista);
			
			System.out.println(lista);
		}

}
