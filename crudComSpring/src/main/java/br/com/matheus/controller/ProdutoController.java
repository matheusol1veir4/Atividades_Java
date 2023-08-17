package br.com.matheus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.matheus.model.Produto;
import br.com.matheus.repository.ProdutoRepository;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/produto")
	public String produto (Model requisicao) {
		requisicao.addAttribute("valor",33);
		return "produtos";
	}
	
	@GetMapping("/")
	public String paginaPrincipal () {
		return "index";
	}
	
	@GetMapping("/cadastrarProduto")
	public String paginaAdicionarProduto (Produto produto) {
		return "adicionar_produto";
	}
	
	@PostMapping
	public String adicionaProduto(@Valid Produto produto,
			Errors erros, BindingResult result, Model model) {
		if(result.hasErrors()|| (null != erros && erros.getErrorCount() > 0)) {
			return "adicionar_produto";
		}
		
		produtoRepository.save(produto);
		return "redirect:/produto";
	}
	
	
}
