package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double F;
		
		System.out.println("Insira a temperatura em graus Fahrenheit");
		F = leia.nextDouble();
		
		System.out.println("São " + (5 *((F-32)/9))+ " Graus Celsius");
		
		leia.close();
	}

}
