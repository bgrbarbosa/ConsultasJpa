package br.com.consulta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.consulta.model.Produto;
import br.com.consulta.service.ProdutoServiceNativo;
import br.com.consulta.service.ProdutoServiceSpecification;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/produtos/specification")
public class ProdutoControllerSpecification {
	
	@Autowired 
	private ProdutoServiceSpecification service;

	// Buscar todos os Produtos
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// Buscar pelo nome do Produto via specification
    @GetMapping("/nome/{nome}")
    public ResponseEntity<Object>buscarPorNome(@PathVariable(value = "nome") String nome){
    	List<Produto>produto = service.buscarPorNome(nome);
   		return ResponseEntity.status(HttpStatus.OK).body(produto);  
    }
    
	// Buscar pelo preço do Produto via specification
    @GetMapping("/preco/{preco}")
    public ResponseEntity<Object>buscarPorPreco(@PathVariable(value = "preco") Double preco){
    	List<Produto>produto = service.buscarPorPreco(preco);
   		return ResponseEntity.status(HttpStatus.OK).body(produto);  
    }
    
	// Buscar pela url exata do Produto via specification
    @GetMapping("/url/{url}")
    public ResponseEntity<Object>buscarPorUrl(@PathVariable(value = "url") String url){
    	List<Produto>produto = service.buscarPelaUrlExata(url);
   		return ResponseEntity.status(HttpStatus.OK).body(produto);  
    }
    
	// Buscar por intervalo de preço do Produto via specification
    @GetMapping("/preco/entre/{preco1},{preco2}")
    public ResponseEntity<Object>buscarPorIntervaloPreco(@RequestParam(value = "preco1") Double preco1,
    													 @RequestParam(value = "preco2") Double preco2){
    	List<Produto>produto = service.buscarPorIntervaloPreco(preco1, preco2);
   		return ResponseEntity.status(HttpStatus.OK).body(produto);  
    }
	
	

}
