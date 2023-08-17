package br.com.matheus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull (message = "Campo Obrigatório")
	@Size (min = 2, max = 100, message = "Nome deve conter entre 2 e 100 caracteres")
	private String nome;
	
	@Min (0)
	private int quantidade;
	
	@Min(0)
	private double preco;
	
	@NotNull(message = "Campo Obrigatório")
	@Size(min = 2, max = 254, message = "A descrição do produto deve conter entre 2 a 254 caracteres")
	private String descricaoProduto;
	
	@NotNull(message="Campo Obrigatório")
	@Size(min = 2, max = 254, message = "A descrição do produto deve conter entre 2 a 254 caracteres")
	private String urlImagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	
}
