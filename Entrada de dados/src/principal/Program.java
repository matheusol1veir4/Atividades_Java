package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		double precoDaCamisa;
		String nome;
		char sexo;
		
		System.out.println("Entre com seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com o sexo: ");
		sexo = leia.next().charAt (0);
		
		System.out.println("Entre com sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Entre com o pre�o da camisa: ");
		precoDaCamisa  = leia.nextDouble();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Sexo digitado: " + sexo);
		System.out.println("Idade digitada: " + idade);
		System.out.println("Valor da camisa " + precoDaCamisa);
		
		
		
		
		leia.close();
	}

}
