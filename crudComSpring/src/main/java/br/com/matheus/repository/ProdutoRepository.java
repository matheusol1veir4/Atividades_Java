package br.com.matheus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matheus.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
