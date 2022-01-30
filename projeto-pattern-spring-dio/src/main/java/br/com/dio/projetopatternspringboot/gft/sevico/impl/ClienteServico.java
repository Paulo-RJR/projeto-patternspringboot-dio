package br.com.dio.projetopatternspringboot.gft.sevico.impl;

import br.com.dio.projetopatternspringboot.gft.modelo.Cliente;

/**
 * Para fazer multiplas implementações deste mesma Interface, se necessário.
 *
 * @author paulo
 */

public interface ClienteServico {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
