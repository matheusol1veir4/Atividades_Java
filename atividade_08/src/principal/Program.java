package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Entre com o primeiro n�mero");
		num1 = sc.nextInt ();
		
		System.out.println("Entre com o segundo n�mero");
		num2 = sc.nextInt ();
		
		System.out.println("Entre com o terceiro n�mero");
		num3 = sc.nextInt ();
		
		/*if(num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);
		}
		
		if (num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		}
		
		if (num3 > num2 && num3 > num1) {
			System.out.println("O maior n�mero �: " + num3);} */
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);}
		
		else if (num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		}
		
		else {
				System.out.println("o maior numero �:" + num3);
		}
		sc.close();
}
	}
