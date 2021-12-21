package com.botidev.apirest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// Metodo Lista Todos os Produtos
	@GetMapping("/produtos")
	public List<Produto> listaProdutos() {
		return produtoRepository.findAll();
	}

	// Metodo listar Produtos passando Parametro id
	@GetMapping("/produtos/{id}")
	public Produto listaProdutosUnico(@PathVariable(value = "id") long id) {
		return produtoRepository.findById(id);
	}

	// metodo Post Para enviar os dados
	@PostMapping("/produtos")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	/*
	 * Metodo Delete Passando Parametro id
	 * 
	 * @DeleteMapping("/produtos/{id}") public Produto
	 * deleteUser(@PathVariable(value = "id")long id) { return
	 * produtoRepository.deleteById(id); }
	 */
	
	@DeleteMapping("/produtos")
	public void deletarProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produtos")
	public Produto AlterarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

}
