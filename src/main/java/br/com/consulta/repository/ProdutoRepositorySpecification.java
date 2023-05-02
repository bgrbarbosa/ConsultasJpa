package br.com.consulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.com.consulta.model.Produto;

@Repository
public interface ProdutoRepositorySpecification extends JpaRepository<Produto, Long> ,JpaSpecificationExecutor<Produto> {

}
