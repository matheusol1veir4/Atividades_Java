package entities;

public class Pessoa {
	public String nome;
	public int idade;
	public char sexo;
	
	//funções em classes são chamadas de métodos
	public void retornaIdade(int ano) {
		idade = 2023 - ano ;
	}
}