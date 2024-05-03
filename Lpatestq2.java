package LPAlore;

import java.util.Scanner;

public class Lpatestq2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int n;
		
		System.out.println("Qual é o número do mês que você quer saber o nome: "); //Aqui pedimos para que seja informado em um número o mês que a pessoa esteja interessada em saber o nome
		n = ler.nextInt();
		
		if (n==1) {                           // E apartir daqui para baixo vemos os nomes dos mêses que são escritos após escolhermos o número que está logo acima deles
			System.out.println("Janeiro");
		}
		else if (n==2) {
			System.out.println("Fevereiro");
		}
		else if (n==3) {
			System.out.println("Março");
		}
		else if (n==4) {
			System.out.println("Abril");
		}
		else if (n==5) {
			System.out.println("Maio");
		}
		else if (n==6) {
			System.out.println("Junho");
		}
		else if (n==7) {
			System.out.println("Julho");
		}
		else if (n==8) {
			System.out.println("Agosto");
		}
		else if (n==9) {
			System.out.println("Setembro");
		}
		else if (n==10) {
			System.out.println("Outubro");
		}
		else if (n==11) {
			System.out.println("Novembro");
		}
		else if (n==12) {
			System.out.println("Dezembro");
		}
		else
			System.out.println("Mês Invalido"); //E caso escolhamos um número que não esteja aqui acima esta mensagem aparecerá
	}

}
