package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Entre com o primeiro n�mero");
		numero1 = leia.nextInt();
		
		System.out.println("Entre com o segundo n�mero");
		numero2 = leia.nextInt();
		
		System.out.println("A soma dos n�meros �: " + (numero1 + numero2));
				
		leia.close();
	}

}
