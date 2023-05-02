package br.com.consulta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.consulta.model.Produto;
import br.com.consulta.service.ProdutoServiceNativo;

@RestController
@RequestMapping(value = "/produtos/consultanativa")
public class ProdutoControllerNativo {
	
	@Autowired 
	private ProdutoServiceNativo service;

	// Buscar todos os Produtos
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	// Buscar pelo Id do Produto
    @GetMapping("/{id}")
    public ResponseEntity<Object>buscarPorCodigo(@PathVariable(value = "id")Long id){
    	Optional<Produto>produto = service.buscarPorId(id);
    	if (!produto.isPresent()) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto nao encontrado");
    	}else {
    		return ResponseEntity.status(HttpStatus.OK).body(produto.get());
    	}
    }
    
    // Buscar pelo preço do produto
    @GetMapping("/preco/{preco}")
    public ResponseEntity<Object>buscarPorPreco(@PathVariable(value = "preco")Double preco){
    	List<Produto>produto = service.buscarPorPreco(preco);
    	return ResponseEntity.status(HttpStatus.OK).body(produto);
    }
    
	// Buscar pela url do Produto
    @GetMapping("/url/{url}")
    public ResponseEntity<Object>buscarPorUrl(@PathVariable(value = "url")String url){
    	Optional<Produto>produto = service.buscarPorUrl(url);
    	if (!produto.isPresent()) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto nao encontrado");
    	}else {
    		return ResponseEntity.status(HttpStatus.OK).body(produto.get());
    	}
    }
    
	// Buscar pelo nome do Produto
    @GetMapping("/nome/{nome}")
    public ResponseEntity<Object>buscarPorNome(@PathVariable(value = "nome")String nome){
    	Optional<Produto>produto = service.buscarPorNomeProduto(nome);
    	if (!produto.isPresent()) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto nao encontrado");
    	}else {
    		return ResponseEntity.status(HttpStatus.OK).body(produto.get());
    	}
    }
}
