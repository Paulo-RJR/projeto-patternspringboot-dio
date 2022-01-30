package br.com.dio.projetopatternspringboot.gft.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositorio extends CrudRepository<Cliente, Long> {
}
