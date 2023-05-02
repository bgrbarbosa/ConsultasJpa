package br.com.consulta.specification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import br.com.consulta.model.Produto;
import br.com.consulta.repository.ProdutoRepositoryNativo;


public class ProdutoSpecification {
	
	@Autowired
	ProdutoRepositoryNativo repository;
	
	// Pesquisa pela especificação do campo nome do produto
	public static Specification<Produto> nome(String nome) {
		return (root, criteriaQuery, criteriaBuilder) -> 
			criteriaBuilder.like(root.get("nomeProduto"), "%" + nome + "%");
	}
	
	// Pesquisa pela especificação do campo preco
	public static Specification<Produto> precoProduto(Double precoProduto) {
		return (root, criteriaQuery, criteriaBuilder) -> 
			criteriaBuilder.equal(root.get("precoProduto"), precoProduto);
	}
	
	// Pesquisa pela especificação do campo URL exata do produto
	public static Specification<Produto> urlImage(String urlImage) {
		return (root, criteriaQuery, criteriaBuilder) -> 
			criteriaBuilder.equal(root.get("urlImage"), urlImage);
	}
	
	// Pesquisa pela especificação contendo um intervalo de preço do produto
	public static Specification<Produto> precoProduto(Double preco1, Double preco2) {
		return (root, criteriaQuery, criteriaBuilder) -> 
			criteriaBuilder.between(root.get("precoProduto"), preco1, preco2);
	}
	
	



}
