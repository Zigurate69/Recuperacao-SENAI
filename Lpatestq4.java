package LPAlore;

import java.util.Scanner;

public class Lpatestq4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double v1,v2,v3, soma;
		
		System.out.println("Informe o primeiro valor: "); //Aqui informamos o primeiro valor
		v1 = ler.nextDouble();
		
		System.out.println("Informe o segundo valor: "); //Aqui o segundo valor
		v2 = ler.nextDouble();
		
		System.out.println("Informe o terceiro valor: "); //Aqui o terceiro valor
		v3 = ler.nextDouble();
		
		soma = v1 + v2 + v3; //Aqui temos uma conta onde somamos todos os valores informados
		
		if (soma >= 80) {
			System.out.println("O resultado da soma é: " + soma); //Aqui informamos que caso a soma seja maior do que o número 80 esta mensagem irá aparecer
		}
		else
			System.out.println("O resultado da soma foi menor do que 80"); //Está mensagem irá aparecer caso o resultado da soma não passe de 80

	}

}
