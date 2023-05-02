package br.com.consulta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import br.com.consulta.model.Produto;

@Repository
public interface ProdutoRepositoryJPQL extends JpaRepository<Produto, Long> {
	
	@Query(value = "SELECT * FROM TB_PRODUTO p WHERE p.preco_produto < :preco", nativeQuery = true)
	List<Produto>produtoMenorQue(Double preco);
	
	@Query(value = "SELECT * FROM TB_PRODUTO p order by p.preco_produto", nativeQuery = true)
	List<Produto>produtoPrecoCrescente();
	
	@Query(value = "SELECT * FROM TB_PRODUTO p order by p.preco_produto desc", nativeQuery = true)
	List<Produto>produtoPrecoDecrescente();
	
	@Query(value = "SELECT * FROM TB_PRODUTO p WHERE p.nome_produto like %:nome%", nativeQuery = true)
	List<Produto>produtoParticulaNome(String nome);
	

	
}
