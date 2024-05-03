package LPAlore;

import java.util.Scanner;

public class Lpatestq1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String l;
		String s;
		
		System.out.println("Informe o seu login: "); // Pede para que você informe o seu login
		l = ler.next();
		
		System.out.println("Informe a sua senha: "); // Pede para que você informe a sua senha
		s = ler.next();
		
		if (l.equals("samuel.filho3")&& s.equals("7434")) { // Aqui nos é mostrado que caso o login seja samuel.filho3 e a senha igual a 7434 você receberá a mensagem abaixo
			System.out.println("Bem-vindo ao Sistema Senai");
		}
		else
			System.out.println("Dados Incorretos, informe os dados novamente"); // Aqui nós é mostrado caso os requisitos de cima náo sejam atendidos
		
	
				
	}

}
