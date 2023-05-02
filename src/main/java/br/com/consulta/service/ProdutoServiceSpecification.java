package br.com.consulta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.com.consulta.model.Produto;
import br.com.consulta.repository.ProdutoRepositoryNativo;
import br.com.consulta.repository.ProdutoRepositorySpecification;
import br.com.consulta.specification.ProdutoSpecification;


@Service
public class ProdutoServiceSpecification {
	
	@Autowired
	private ProdutoRepositorySpecification repository;
		
	// Método nativo do repository
	public List<Produto>findAll(){
		return repository.findAll();
	}
	
	public List<Produto>buscarPorNome(String nome){
		return repository.findAll(Specification.where(ProdutoSpecification.nome(nome)));
	}
	
	public List<Produto>buscarPorPreco(Double preco){
		return repository.findAll(Specification.where(ProdutoSpecification.precoProduto(preco)));
	}
	
	public List<Produto>buscarPelaUrlExata(String url){
		return repository.findAll(Specification.where(ProdutoSpecification.urlImage(url)));
	}
	
	public List<Produto>buscarPorIntervaloPreco(Double preco1, Double preco2){
		return repository.findAll(Specification.where(ProdutoSpecification.precoProduto(preco1, preco2)));
	}
	


}
