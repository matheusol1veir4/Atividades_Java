package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double valorPorHora;
		double horasPorMes;
		
		System.out.println("Quantas horas voc� trabalha por m�s ?: ");
		valorPorHora = leia.nextDouble();
		
		System.out.println("Quanto voc� recebe por hora ?: ");
		horasPorMes = leia.nextDouble ();
		
		System.out.println("O total do seu sal�rio este m�s �: " + (valorPorHora * horasPorMes));
		
		leia.close();
	}

}
