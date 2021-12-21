package com.botidev.apirest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botidev.apirest.models.Produto;
import com.botidev.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	// Lista Todos os Produtos
	@GetMapping("/produtos")
	public List<Produto>listaProdutos(){
		return produtoRepository.findAll();
	}
	
	// listar Produtos Pelo ID
	@GetMapping("/produtos/{id}")
	public  Produto  listaProdutosUnico(@PathVariable(value = "id")long id){
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produtos")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	

}
