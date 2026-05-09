package com.disenartis.factugo.domain.port.out;

import com.disenartis.factugo.domain.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {
    Cliente guardar(Cliente cliente);
    Optional<Cliente> buscarPorId(Long id);
    List<Cliente> buscarTodos();
    List<Cliente> buscarActivos();
    void eliminar(Long id);
}
