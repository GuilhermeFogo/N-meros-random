package Main;

import Senhas.gerador;

public class principal {

	public static void main(String[] args) {
		gerador cria = new gerador();
		
		String campo = "0";
		double res;
		while (true) {
			res = cria.gera_numero_aleatorio(852);
			
			System.out.println(res);
			
			res = cria.gera_numeros_letrados(2);
			
			System.out.println(res);	
		}

	}

}
