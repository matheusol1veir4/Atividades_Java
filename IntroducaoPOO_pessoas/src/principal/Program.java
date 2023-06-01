package principal;

import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Pessoas pessoas = new Pessoas ();
		
		/* pessoas.nome = "Matheus";
		pessoas.idade = 25;
		pessoas.sexo = "Masculino"; */
		
		System.out.println("Insira o nome: ");
		pessoas.nome = sc.nextLine();
		
		System.out.println("Insira a idade: " );
		pessoas.idade = sc.nextInt ();
		
		System.out.println("Insira o sexo: " );
		pessoas.sexo = sc.next().charAt(0);
		
		
		
		System.out.println("Pessoa: " + pessoas.nome + " " + pessoas.idade + " " + pessoas.sexo );

	}

}
