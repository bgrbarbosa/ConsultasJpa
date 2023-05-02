package br.com.consulta.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.consulta.model.Produto;

@Repository
public interface ProdutoRepositoryNativo extends JpaRepository<Produto, Long> {

	// Busca realizadas pelos atributos existentes nas classes
	List<Produto> findByPrecoProduto(Double preco);
	
	Optional<Produto> findByUrlImage(String url);
	
	Optional<Produto> findByNomeProduto(String url);
		
}
