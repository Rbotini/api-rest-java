package com.botidev.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.botidev.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
