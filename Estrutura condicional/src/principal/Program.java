package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 10;
		int numero2 = 25;
		boolean verdadeiro = false;
		
		// if = se
		if (numero1 >= numero2) {
			System.out.println("numero 1 é o maior");
		}
		
		// else = senão
		else {
			System.out.println("Numero 2 é o maior");
		}
		
		if (verdadeiro == true) {
			System.out.println("Verdadeiro");
		}
		
		else {
			System.out.println("Falso");
		}
		
		//Exemplo usando resto da divisão
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Entre com um número para saber se é par ou ímpar");
		numero = leia.nextInt();
		
		// se o resto da minha divisão for igual a zero
		// % esse símbolo significa: resto da divisão.
		if(numero % 2 == 0) {
			System.out.println("Numero par!");
		}
		
		else {
			System.out.println("Numero ímpar");
		}
		
		leia.close();
		
	}

}
