package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Pessoa pessoa = new Pessoa ();
		
		System.out.print("Insira o nome: ");
		pessoa.nome = sc.nextLine();
		
		System.out.print("Insira o ano de nascimento: ");
		int data = sc.nextInt();
		//pessoa.retornaIdade(sc.nextInt());
		
		System.out.print("Insira o sexo: " );
		pessoa.sexo = sc.next().charAt(0);
		
		pessoa.retornaIdade(data);
		
		System.out.println("nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
		System.out.println("sexo: " + pessoa.sexo);
		
		sc.close();
	}

}
