package br.com.consulta.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.consulta.model.Produto;
import br.com.consulta.repository.ProdutoRepositoryNativo;

@Configuration
@Profile(value = "dev")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ProdutoRepositoryNativo produtoRepository;

	@Override
	public void run(String... args) throws Exception {
	
		Produto p1 = new Produto(null, "Pastel de Carne",  "Esse pastel contém carne moída e recheio de catupiry", "imagem1", 4.00);
		Produto p2 = new Produto(null, "Pastel de Queijo", "Esse pastel contém queijo branco", "imagem2", 4.50);
		Produto p3 = new Produto(null, "Pastel de 4 queijos",  "Esse pastel contém queijo mussarela, parmesão, cheader e gorgonsola", "imagem3", 5.00);
		Produto p4 = new Produto(null, "Pastel de Queijo e Presunto",  "Esse pastel contém queijo e presunto", "imagem4", 4.50);
		Produto p5 = new Produto(null, "Pastel de Frango",  "Esse pastel contém carne de frango", "imagem5", 4.00);
		Produto p6 = new Produto(null, "Pastel de Frango com Catupiry",  "Esse pastel contém frango e recheio de catupiry", "imagem6", 4.50);
		Produto p7 = new Produto(null, "Pastel de Camarão",  "Esse pastel contém camarao e recheio de catupiry", "imagem7", 6.00);
		Produto p8 = new Produto(null, "Pastel de Palmito",  "Esse pastel contém Palmito", "imagem8", 4.00);
		Produto p9 = new Produto(null, "Pastel de Carne Seca",  "Esse pastel contém carne seca com recheio de catupiry", "imagem9", 4.50);
		Produto p10 = new Produto(null, "Pastel de Banana", "Esse pastel contém banana com canela", "imagem10", 4.00);
		Produto p11 = new Produto(null, "Pastel de Chocolate", "Esse pastel contém nutela", "imagem11", 4.00);
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
		

	}
}
