package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Entre com o n�mero: ");
		valor = leia.nextInt();
		
		System.out.println("O n�mero informado foi " + valor);
		
		leia.close();
	}

}
