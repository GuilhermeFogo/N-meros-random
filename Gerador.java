package Objetos;

import java.util.Random;

public class Gerador extends Senhas {
	
	public String Criar_senha_comum(String caracteres_senha) {
		setRandom(new Random());
		long num = getRandom().nextLong();
		int num1 = getRandom().nextInt(5);
		setSenha(caracteres_senha);
		double pi = Math.PI;
		
		double resultado = 0;
		
		for (int i = 0; i < getSenha().length(); i++) {
			resultado = pi * num;
			resultado+=resultado;
		}
		resultado*=num1;
		
		num1+= resultado;
		resultado /= num1;
		
		Double reDouble = resultado;
		
		// verificando se é NaN
		if (reDouble.isNaN()) {
			return "algo deu errado";
		}else{
			// verificando o valor é maior = 0
			if (resultado <= 0) {
				return "numero negativo";
			}else{
				if (resultado> 0) {
					return reDouble.toString();
				}else{
					reDouble = -(resultado);
					return reDouble.toString();
				}
		}
		
		}
	}
}
