package com.alex.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.estoque.domain.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

}
