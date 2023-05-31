package principal;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Pessoas pessoas = new Pessoas ();
		
		pessoas.nome = "Matheus";
		pessoas.idade = 25;
		pessoas.sexo = "Masculino";
		
		System.out.println("Pessoa: " + pessoas.nome + " " + pessoas.idade + " " + pessoas.sexo );

	}

}
