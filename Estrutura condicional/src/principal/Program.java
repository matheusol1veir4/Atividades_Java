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
			System.out.println("numero 1 � o maior");
		}
		
		// else = sen�o
		else {
			System.out.println("Numero 2 � o maior");
		}
		
		if (verdadeiro == true) {
			System.out.println("Verdadeiro");
		}
		
		else {
			System.out.println("Falso");
		}
		
		//Exemplo usando resto da divis�o
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Entre com um n�mero para saber se � par ou �mpar");
		numero = leia.nextInt();
		
		// se o resto da minha divis�o for igual a zero
		// % esse s�mbolo significa: resto da divis�o.
		if(numero % 2 == 0) {
			System.out.println("Numero par!");
		}
		
		else {
			System.out.println("Numero �mpar");
		}
		
		leia.close();
		
	}

}
