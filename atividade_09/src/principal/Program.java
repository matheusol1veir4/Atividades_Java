package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random randon = new Random();
		
	int numero1 = randon.nextInt (6) + 1;
	int numero2 = randon.nextInt (6) + 1;
	int numero3 = randon.nextInt (6) + 1;
	int totalDePontos = numero1 + numero2 + numero3;
	
	System.out.println(numero1);
	System.out.println(numero2);
	System.out.println(numero3);
	
	System.out.println(totalDePontos);
	
	if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("Voc� � muito sortudo !!!");
			System.out.println("Voc� ganhou 6 pontos de bonus.");
			totalDePontos = totalDePontos +6;
			System.out.println(totalDePontos);
		}
		else {
		System.out.println("Voc� ganhou 2 pontos de b�nus");
		totalDePontos = totalDePontos +2; 
		System.out.println(totalDePontos);
		}
	
	}
	
	if ( totalDePontos < 15 ) {
		System.out.println(" Lamento mas infelizmente voc� perdeu.  ");
	}
	
	else { System.out.println(" Parab�ns voc� ganhou !!! "); }
	
	
	}
}

	
