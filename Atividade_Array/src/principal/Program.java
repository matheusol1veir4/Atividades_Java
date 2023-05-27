package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double media = 0;
		
		System.out.println("Insira o seu nome: ");
		nome = sc.nextLine();
		
		double [] notas = new double [4];
		for (int contador = 0; contador <notas.length; contador++) {
			System.out.println("Digite a nota: ");
			notas [contador] = sc.nextDouble();
			
		media = media + notas [contador];
		}
		//Segunda possibilidade: double media2 = (notas[0] + notas[1]+ notas[2]+ notas[3]) / notas.length;
		
		System.out.println("A média é: " + (media / notas.length));
		
		//System.out.println("A media2 é: " + media2);
	}

}
