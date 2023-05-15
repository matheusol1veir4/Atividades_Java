package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Entre com o primeiro número");
		num1 = sc.nextInt ();
		
		System.out.println("Entre com o segundo número");
		num2 = sc.nextInt ();
		
		System.out.println("Entre com o terceiro número");
		num3 = sc.nextInt ();
		
		/*if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);
		}
		
		if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é: " + num2);
		}
		
		if (num3 > num2 && num3 > num1) {
			System.out.println("O maior número é: " + num3);} */
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);}
		
		else if (num2 > num3) {
			System.out.println("O maior número é: " + num2);
		}
		
		else {
				System.out.println("o maior numero é:" + num3);
		}
		sc.close();
}
	}
