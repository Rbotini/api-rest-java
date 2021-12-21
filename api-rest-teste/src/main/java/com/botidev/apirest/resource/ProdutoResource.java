package com.botidev.apirest.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botidev.apirest.models.Produto;
import com.botidev.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {
	
	@Autowired
	
	ProdutoRepository produtoRepository;
	
	
	@GetMapping(value = "/Produtos")
	
	public List<Produto> listarProdutos() {
		
		return  produtoRepository.findAll();
		
	}

}
