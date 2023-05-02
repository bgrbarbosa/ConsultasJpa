package br.com.consulta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.consulta.model.Produto;
import br.com.consulta.repository.ProdutoRepositoryNativo;


@Service
public class ProdutoServiceNativo {
	
	@Autowired
	private ProdutoRepositoryNativo repository;
		
	// Métodos nativo do repository
	public List<Produto>findAll(){
		return repository.findAll();
	}
	
	public Optional<Produto>buscarPorId(Long id){
		return repository.findById(id);
	}
	
	// Métodos de consultas pelos atributos das classes
	public List<Produto>buscarPorPreco(Double preco){
		return repository.findByPrecoProduto(preco);
	}
	
	public Optional<Produto>buscarPorUrl(String url){
		return repository.findByUrlImage(url);
	}
	
	public Optional<Produto>buscarPorNomeProduto(String url){
		return repository.findByNomeProduto(url);
	}
	


}
