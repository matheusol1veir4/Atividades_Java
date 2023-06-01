package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		AreaTerreno medida = new AreaTerreno ();
		
		System.out.println("Insira o valor da base do terreno: ");
		double base = sc.nextDouble();
		
		System.out.println("Insira o valor da altura do terreno: ");
		double altura = sc.nextDouble();
		
		medida.retornaArea(base, altura);
		
		System.out.println("A área do seu terreno é: " + medida.medida);
		
		
	}

}
