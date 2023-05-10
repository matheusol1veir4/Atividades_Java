package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double notaPrimeiroBimestre;
		double notaSegundoBimestre;
		double notaTerceiroBimestre;
		double notaQuartoBimestre;
		
		System.out.println("Entre com a nota do Primeiro Bimestre: ");
		notaPrimeiroBimestre = leia.nextDouble();
		
		System.out.println("Entre com a nota do Segundo Bimestre: ");
		notaSegundoBimestre = leia.nextDouble();
		
		System.out.println("Entre com a nota do Terceiro Bimestre: ");
		notaTerceiroBimestre = leia.nextDouble();
		
		System.out.println("Entre com a nota do Quarto Bimestre: ");
		notaQuartoBimestre = leia.nextDouble();
		
		System.out.println("A sua média de nota é: " + (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre / 4 ));
		leia.close();
	}

}
