package br.com.matheus.crudProduto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.matheus.crudProduto.model.Produto;
import br.com.matheus.crudProduto.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/pagina_inicial")
	public String paginaInicial (Model model) {
		model.addAttribute("frase", "Exemplo crud");
		return "index";
		
	}
	
	@GetMapping ("/Listar_produtos")
	public String listarProdutos (Model model) {
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("lista_produto", produtos);
		return "listagem_produtos";
	}
	
}
