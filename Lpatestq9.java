package LPAlore;

import java.util.Scanner;

public class Lpatestq9 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double l1, l2, l3;
		
		System.out.print("Informe o tamanho do 1° lado "); //Aqui nos é pedido para digitarmos o tamanho do 1° lado
        l1 = ler.nextDouble();

        System.out.print("Informe o tamanho do 2° lado: "); //Aqui do 2°
        l2 = ler.nextDouble();

        System.out.print("Informe o tamanho do 3° lado: "); //Aqui do 3°
        l3 = ler.nextDouble();
        
        if (l1 == l2 && l2 == l3) { //Aqui ele diz que se caso l1 e l2 forem iguais. E l2 igual a l3, a mensagem abaixo sera escrita
            System.out.println("O Triângulo é Equilátero");
        } 
        else if (l1 == l2 || l1 == l3 || l2 == l3) { //Aqui caso l1 e l2 sejam iguais, l1 e l3 sejam iguais. E l2 e l3 sejam iguais, a mensagem abaixo será escrita
            System.out.println("O Triângulo é Isósceles");
        } 
        else {
            System.out.println("O Triângulo é Escaleno"); //Aqui caso nenhum das opções acima tenham sido iguais aos requisitos do if, esta mensagem será escrita
		    }
	  }

}