package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double valorPorHora;
		double horasPorMes;
		
		System.out.println("Quantas horas você trabalha por mês ?: ");
		valorPorHora = leia.nextDouble();
		
		System.out.println("Quanto você recebe por hora ?: ");
		horasPorMes = leia.nextDouble ();
		
		System.out.println("O total do seu salário este mês é: " + (valorPorHora * horasPorMes));
		
		leia.close();
	}

}
