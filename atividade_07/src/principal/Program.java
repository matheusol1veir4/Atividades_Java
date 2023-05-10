package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		double C;
		
		
		System.out.println("Insira a temperatura em graus Celsius");
		C = leia.nextDouble();
		
		System.out.println("São " + (( C * 1.8) + 32)  + " Graus Fahrenheit");
		
		leia.close();
	}

}
