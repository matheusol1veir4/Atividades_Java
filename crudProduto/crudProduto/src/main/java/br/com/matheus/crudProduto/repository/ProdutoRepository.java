package br.com.matheus.crudProduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matheus.crudProduto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
