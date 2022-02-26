package com.alex.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.estoque.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
