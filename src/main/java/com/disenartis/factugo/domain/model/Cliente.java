package com.disenartis.factugo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {
    private Long id;
    private String nombre;
    private String apellidos;
    private String razonSocial;
    private TipoPersona tipoPersona;
    private String nif;
    private String email;
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String ciudad;
    private String provincia;
    private String pais;
    private FormaPago formaPago;
    private Integer diasPago;
    private String cuentaBancaria;
    private Boolean activo;
    private LocalDate fechaCreacion;
    private LocalDate fechaBaja;
    private String observaciones;
}
