package br.com.api.repository;

import br.com.api.model.PessoaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PessoaRepository extends CrudRepository<PessoaModel, Integer> {
	
	List<PessoaModel> findAll();
}
