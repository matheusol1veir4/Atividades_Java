package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			
		
		double somaAltura = 0;
		double altura = 0;
		// o contador irá começar em zero.
		int contador =0;
		
		/*for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Insira a altura: ");
			altura = sc.nextDouble();
			somaAltura += altura;
			}*/
		
		while (contador <5) {
			System.out.println("Insira a altura");
			altura = sc.nextDouble();
			somaAltura += altura;
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("A média das alturas é: " + (somaAltura / contador));
		
		sc.close();
		
	}
	
}
