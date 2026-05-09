package com.disenartis.factugo.infrastructure.out.persistence.sql.mapper;

import com.disenartis.factugo.domain.model.Cliente;
import com.disenartis.factugo.infrastructure.out.persistence.sql.entity.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteEntity toEntity(Cliente cliente) {
        return ClienteEntity.builder()
                .id(cliente.getId())
                .nombre(cliente.getNombre())
                .apellidos(cliente.getApellidos())
                .razonSocial(cliente.getRazonSocial())
                .tipoPersona(cliente.getTipoPersona())
                .nif(cliente.getNif())
                .email(cliente.getEmail())
                .telefono(cliente.getTelefono())
                .direccion(cliente.getDireccion())
                .codigoPostal(cliente.getCodigoPostal())
                .ciudad(cliente.getCiudad())
                .provincia(cliente.getProvincia())
                .pais(cliente.getPais())
                .formaPago(cliente.getFormaPago())
                .diasPago(cliente.getDiasPago())
                .cuentaBancaria(cliente.getCuentaBancaria())
                .activo(cliente.getActivo())
                .fechaCreacion(cliente.getFechaCreacion())
                .fechaBaja(cliente.getFechaBaja())
                .observaciones(cliente.getObservaciones())
                .build();
    }

    public Cliente toDomain(ClienteEntity entity) {
        return Cliente.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .apellidos(entity.getApellidos())
                .razonSocial(entity.getRazonSocial())
                .tipoPersona(entity.getTipoPersona())
                .nif(entity.getNif())
                .email(entity.getEmail())
                .telefono(entity.getTelefono())
                .direccion(entity.getDireccion())
                .codigoPostal(entity.getCodigoPostal())
                .ciudad(entity.getCiudad())
                .provincia(entity.getProvincia())
                .pais(entity.getPais())
                .formaPago(entity.getFormaPago())
                .diasPago(entity.getDiasPago())
                .cuentaBancaria(entity.getCuentaBancaria())
                .activo(entity.getActivo())
                .fechaCreacion(entity.getFechaCreacion())
                .fechaBaja(entity.getFechaBaja())
                .observaciones(entity.getObservaciones())
                .build();
    }
}