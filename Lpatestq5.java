package LPAlore;

import java.util.Scanner;

public class Lpatestq5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String r;
		
		System.out.println("Em qual turno você estuda? (M - Matutino, V - Vespertino, N - Noturno) "); //Aqui nos é pedido para informarmos o turno em que estudamos
		r = ler.next();
		
		if (r.equals("M")) {                       //Se r equivaler a M, a mensagem Bom Dia será escrita para a pessoa
			System.out.println("Bom Dia!"); 
		}
		else if (r.equals("V")) {                  //Se r equivaler a V, a mensagem Boa Tarde será escrita para a pessoa
			System.out.println("Boa Tarde!");
		}
		else if (r.equals("N")) {                  //Se r equivaler a N, a mensagem Boa Noite será escrita para a pessoa
			System.out.println("Boa Noite!");
		}
		else {
			System.out.println("Valor Inválido");  //Caso a pessoa escreva outra letra que esteja fora do M, V e N, está mensagem aparecerá dizendo que este turno é inválido
		}
		

	}

}
