package br.com.dio.projetopatternspringboot.gft.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //Uso Opcional, pois este já faz parte do springframework
public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
}
