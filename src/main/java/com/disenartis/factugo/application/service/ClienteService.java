package com.disenartis.factugo.application.service;

import com.disenartis.factugo.domain.model.Cliente;
import com.disenartis.factugo.domain.port.in.ClienteUseCase;
import com.disenartis.factugo.domain.port.out.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService implements ClienteUseCase {

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente crear(Cliente cliente) {
        cliente.setActivo(true);
        cliente.setFechaCreacion(LocalDate.now());
        return clienteRepository.guardar(cliente);
    }

    @Override
    public Cliente actualizar(Long id, Cliente cliente) {
        cliente.setId(id);
        return clienteRepository.guardar(cliente);
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.buscarPorId(id);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clienteRepository.buscarTodos();
    }

    @Override
    public List<Cliente> buscarActivos() {
        return clienteRepository.buscarActivos();
    }

    @Override
    public void darDeBaja(Long id) {
        clienteRepository.buscarPorId(id).ifPresent(cliente -> {
            cliente.setActivo(false);
            cliente.setFechaBaja(LocalDate.now());
            clienteRepository.guardar(cliente);
        });
    }

    @Override
    public void eliminar(Long id) {
        clienteRepository.eliminar(id);
    }
}
