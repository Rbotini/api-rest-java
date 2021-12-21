package com.botidev.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.botidev.apirest.models.Produto;

//Criado Jpa Repository metodos para persistencia no banco de dados

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);
	Produto deleteById(long id);

	
}
