package entities;

public class Pessoa {
	public String nome;
	public int idade;
	public char sexo;
	
	//fun��es em classes s�o chamadas de m�todos
	public void retornaIdade(int ano) {
		idade = 2023 - ano ;
	}
}