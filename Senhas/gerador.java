package Senhas;

import java.util.Random;
import java.math.*;
public class gerador {
	 private double numero;
	 private Random aleatorio = new Random();
	private Math numeros;
	 public gerador() {
		
	}
	
	public double gera_numero_aleatorio(double campo){
		this.numero = campo;
		 campo = aleatorio.nextDouble();
		return campo;
	}
	
	public double gera_numeros_letrados(double campo){
		this.numero = campo;
		campo = aleatorio.nextDouble() * numeros.sqrt(campo);
		campo = numeros.log10(campo);
		return campo;
	}
	
	
	
}
