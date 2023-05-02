package br.com.consulta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.consulta.model.Produto;
import br.com.consulta.repository.ProdutoRepositoryJPQL;
import br.com.consulta.repository.ProdutoRepositoryNativo;


@Service
public class ProdutoServiceJPQL {
	
	@Autowired
	private ProdutoRepositoryJPQL repository;
			
	public List<Produto>buscarPrecoMenorQue(Double preco){
		return repository.produtoMenorQue(preco);
	}
	
	public List<Produto>buscarProdutoPrecoCrescente(){
		return repository.produtoPrecoCrescente();
	}
	
	public List<Produto>buscarProdutoPrecoDecrescente(){
		return repository.produtoPrecoDecrescente();
	}
	
	public List<Produto>buscarParticulaNome(String nome){
		return repository.produtoParticulaNome(nome);
	}
	



}
