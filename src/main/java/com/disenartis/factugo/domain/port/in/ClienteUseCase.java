package com.disenartis.factugo.domain.port.in;

import com.disenartis.factugo.domain.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteUseCase {
    Cliente crear(Cliente cliente);
    Cliente actualizar(Long id, Cliente cliente);
    Optional<Cliente> buscarPorId(Long id);
    List<Cliente> buscarTodos();
    List<Cliente> buscarActivos();
    void darDeBaja(Long id);
    void eliminar(Long id);
}
