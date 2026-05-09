package com.disenartis.factugo.infrastructure.out.persistence.sql.adapter;

import com.disenartis.factugo.domain.model.Cliente;
import com.disenartis.factugo.domain.port.out.ClienteRepository;
import com.disenartis.factugo.infrastructure.out.persistence.sql.mapper.ClienteMapper;
import com.disenartis.factugo.infrastructure.out.persistence.sql.repository.ClienteJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClienteAdapter implements ClienteRepository {

    private final ClienteJpaRepository clienteJpaRepository;
    private final ClienteMapper clienteMapper;

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteMapper.toDomain(
                clienteJpaRepository.save(clienteMapper.toEntity(cliente))
        );
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteJpaRepository.findById(id)
                .map(clienteMapper::toDomain);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clienteJpaRepository.findAll()
                .stream()
                .map(clienteMapper::toDomain)
                .toList();
    }

    @Override
    public List<Cliente> buscarActivos() {
        return clienteJpaRepository.findByActivoTrue()
                .stream()
                .map(clienteMapper::toDomain)
                .toList();
    }

    @Override
    public void eliminar(Long id) {
        clienteJpaRepository.deleteById(id);
    }
}