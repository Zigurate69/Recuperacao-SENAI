package LPAlore;

import java.util.Scanner;

public class Lpatestq7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String g;
		
		System.out.println("Informe seu gênero: F ou M"); //Aqui nos é pedido para informarmos nosso gênero informando a letra F ou M
		g = ler.next();
		
		if (g.equals("F")) { //Aqui é dito que caso a letra F seja digitada a mensagem abaixo será escrita
			System.out.println("Feminino");
		}
		else if (g.equals("M")) { //Já aqui caso a letra M seja digitada a mensagem abaixo será escrita
			System.out.println("Masculino");
		}
		

	}

}
