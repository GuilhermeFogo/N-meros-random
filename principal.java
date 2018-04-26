package Principal;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import Objetos.Gerador;

public class principal {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a um estilo de senha");
		String campo = in.nextLine();
		campo.trim();
		Gerador criar = new Gerador();
		String senha_nova = criar.Criar_senha_comum(campo);
		
		if (senha_nova.equals("algo deu errado") || senha_nova.equals("numero negativo")) {
			System.out.println("tente novamente");
		}else{
			String parte1 = senha_nova.substring(3,10).trim();
			String parte2 = senha_nova.substring(1,9).trim();
			
			String nova_senha =parte1+"@--"+ parte2+"!".trim();
			System.out.println(nova_senha);
		}
		
		
	}
 
}
