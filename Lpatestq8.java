package LPAlore;

import java.util.Scanner;

public class Lpatestq8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		Double n1, n2, n3, n4, n5, media;
		
		System.out.println("Informe a 1° nota: "); //Aqui ele pede para que digitemos a primeira nota do aluno
		n1 = ler.nextDouble();
		
		System.out.println("Informe a 2° nota: "); //aqui a segunda
		n2 = ler.nextDouble();
		
		System.out.println("Informe a 3° nota: "); //Aqui a terceira
		n3 = ler.nextDouble();
		
		System.out.println("Informe a 4° nota: "); //Aqui a quarta
		n4 = ler.nextDouble();
		
		System.out.println("Informe a 5° nota: "); //Aqui a quinta
		n5 = ler.nextDouble();
		
		media = (n1+n2+n3+n4+n5)/5; //Aqui ele faz o cálculo da média, que consiste na soma das 5 notas e na divisão do total dessa soma por 5
		
		if (media >= 6) { //Aqui caso a média seja maior ou igual a 6, a mensagem abaixo irá ser digitada
			System.out.println("Aprovado"); 
		}
		else {
			System.out.println("Reprovado"); //Essa mensagem aparecerá caso a nota do aluno esteja abaixo de 6, que no caso é a média
		}

	}

}
