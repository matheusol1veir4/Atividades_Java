package br.com.matheus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

	@GetMapping("/produto")
	public String produto () {
		return "produtos";
	}
	
}
