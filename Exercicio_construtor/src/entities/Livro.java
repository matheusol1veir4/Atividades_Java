package entities;

public class Livro {
	
	/*
	* Ordem sugerida a seguir na classe :
	* 1� atributos da classe
	* 2� construtores
	* 3� metodos get e set
	* 4� demais m�todos	
	*/
	
	
	private String nome;
	private String edicao;
	private double valor;
	public Livro(String nome, String edicao, double valor) {
		super();
		this.nome = nome;
		this.edicao = edicao;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public double getValor() {
		return valor;
	}
			
	
	public void setValor(double valor) {
		if (valor>100) {
			this.valor += (valor * 0.3);
			} 
		else {
			this.valor = valor ;
			}
		} 
			
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome do livro: " + nome + "\nEdi��o: " + edicao + 
				"\nValor: " + valor;
	}
	
}
