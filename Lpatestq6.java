package LPAlore;

import java.util.Scanner;

public class Lpatestq6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Informe o Número 1: "); //Aqui o código nos pede para que informemos o primeiro número
		n1 = ler.nextInt();
		
		System.out.println("Informe o Número 2: "); //Aqui pede o segundo
		n2 = ler.nextInt();
		
		System.out.println("Informe o Número 3: "); //Aqui o terceiro
		n3 = ler.nextInt();
		
		if (n1>n2&&n1>n3) { //Nessa parte ele fala que caso n1 seja maior que n2 e n3 a mensagem abaixo será exibida
			System.out.println("O número 1 é maior do que os outros números!");
		}
		else if (n2>n1&&n2>n3) { //Aqui caso n2 seja maior que n1 e n3 a mensagem abaixo será exibida
			System.out.println("O número 2 é maior do que os outros números!"); 
		}
		else if (n3>n1&&n3>n2) { //Aqui caso n3 seja maior que n1 e n2 a mensagem abaixo será exibida
			System.out.println("O número 3 é maior do que os outros números!");
		}
		
	}

}
