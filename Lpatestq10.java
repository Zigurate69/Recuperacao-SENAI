package LPAlore;

import java.util.Scanner;

public class Lpatestq10 {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 
		 double n1, n2, resultado;
		 char operador;

	     System.out.println("Digite o primeiro número: "); //Aqui nos é pedido para digitarmos um número
	     n1 = ler.nextDouble();
	        
	     System.out.println("Digite o segundo número: "); //Aqui um segundo número
	     n2 = ler.nextDouble();
	        
	     System.out.println("Digite o tipo de operação que irá utilizar (+, -, *, /): "); //Aqui nós é pedido para informar o tipo de operação que queremos utilizar
	     operador = ler.next().charAt(0);
	        
	     resultado = 0;
	        
	     switch (operador) {
	        case '+': //Aqui ele nos mostra que caso seja digitado +, a conta que será feita com os números sera a conta que está abaixo
	        	resultado = n1 + n2;
	        	break;
	        case '-': //Aqui caso seja digitado -, a conta abaixo será feita com os dois números digitados
	        	resultado = n1 - n2;
	        	break;
	        case '*': //Aqui caso * seja digitado, a conta abaixo será feita com os dois números digitados
	        	resultado = n1 * n2;
	        	break;
	        case '/': //Aqui caso / seja digitado a conta abaixo será recriada com os números digitados
	        	if (n2!= 0) {
	        		resultado = n1 / n2;
	        	} else {
	        		System.out.println("ERROR, Não é possível fazer uma divisão com zero"); //Aqui caso seja selocionado o número 0 na divisão, esta mensagem será digitada
	        		return;
	        	}
	        	break;
	        default:
	        	System.out.println("Operação Inválida"); //Aqui caso seja selecionado outro tipo de operação que não está sendo mostrada para ser selecionada
	        	return;
	        }
	     System.out.println("Resultado: " + resultado); //Aqui será mostrado o resultado final
	}
}