package br.com.projeto.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

    List<Pessoa> findAll();
    
    Pessoa findByCodigo(int codigo);

    List<Pessoa> findByOrderByNomeAsc();

    // List<Pessoa> findByOrderByNomeDesc();

    List<Pessoa> findByNomeOrderByIdadeAsc(String nome);

    // List<Pessoa> findByNomeOrderByIdadeDesc();

    List<Pessoa> findByNomeContaining(String termo);

    List<Pessoa> findByNomeStartingWith(String termo);

    List<Pessoa> findByNomeEndingWith(String termo);
}
