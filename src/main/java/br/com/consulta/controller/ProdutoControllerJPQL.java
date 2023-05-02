package br.com.consulta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.consulta.model.Produto;
import br.com.consulta.service.ProdutoServiceJPQL;

@RestController
@RequestMapping(value = "/produtos/consultajpql")
public class ProdutoControllerJPQL {
	
	@Autowired 
	private ProdutoServiceJPQL service;

	// Buscar pelo Id do Produto
    @GetMapping("/precomenorque/{preco}")
    public ResponseEntity<Object>buscarProdutoMenorQue(@PathVariable(value = "preco")Double preco){
    	List<Produto>produtos = service.buscarPrecoMenorQue(preco);
    		return ResponseEntity.status(HttpStatus.OK).body(produtos);
    	
    }
    
    @GetMapping("/ordenarcrescente")
    public ResponseEntity<Object>buscarProdutoPrecoCrescente(){
    	List<Produto>produtos = service.buscarProdutoPrecoCrescente();
    		return ResponseEntity.status(HttpStatus.OK).body(produtos);
    	
    }
    
    @GetMapping("/ordenardecrescente")
    public ResponseEntity<Object>buscarProdutoPrecoDecrescente(){
    	List<Produto>produtos = service.buscarProdutoPrecoDecrescente();
    		return ResponseEntity.status(HttpStatus.OK).body(produtos);
    	
    }
    
    @GetMapping("/buscarporparticula/{nome}")
    public ResponseEntity<Object>buscarProdutoMenorQue(@PathVariable(value = "nome")String nome){
    	List<Produto>produtos = service.buscarParticulaNome(nome);
    		return ResponseEntity.status(HttpStatus.OK).body(produtos);
    	
    }
    
    
  
}
