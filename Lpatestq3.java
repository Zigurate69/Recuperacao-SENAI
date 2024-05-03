package LPAlore;

import java.util.Scanner;

public class Lpatestq3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: "); // Aqui nos é pedido para que informemos um número inteiro
		numero = ler.nextInt();
		
		if (numero < 0) { // Caso o número digitado esteja abaixo de zero, a mensagem abaixo será escrita, informando que o número que você digitou é negativo
			System.out.println("ERROR, ERROR, ERROR, O número que foi digitado é negativo"); 
		}
	}
}
