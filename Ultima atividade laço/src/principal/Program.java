package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String opcao;
		
		System.out.println("Digite a opera��o que deseja realizar soma, divis�o, multiplica��o, subtra��o ");
		opcao = sc.nextLine();
		
		int numero;
		
		System.out.println("Insira o n�mero: ");
		numero = sc.nextInt();
		
		switch (opcao) {
		case "+":
			for ( int i = 1; i <= 10; i++) {
			int resultado = numero + i;
			System.out.println(numero + "+" + i + " = " + resultado);
			}
			break;
			
		case "-":
			int aux = numero;
			for (int i = 1; i <= 10; i++) {
				int resultado = (++aux) - numero;
				System.out.println((aux) + " - " + numero + " = " + resultado);
			}
			break;
			
		case "*":
			for (int i = 1; i <= 10; i++) {
				int resultado = numero * i;
				System.out.println(numero + "*" + i + "=" + resultado);
			}
			break;
		case "/":
				for (int i = 1; i <= 10; i++) {
				int resultado = numero * i / numero ;
				System.out.println((numero * i)+ "/" + numero + "=" + resultado);
			}
			break;
			
		default:
			System.out.println("N�o corresponde a uma opera��o v�lida !!!!");
			}
		
		
		

	}

}
