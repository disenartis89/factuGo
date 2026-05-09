package com.disenartis.factugo.infrastructure.out.persistence.sql.entity;

import com.disenartis.factugo.domain.model.FormaPago;
import com.disenartis.factugo.domain.model.TipoPersona;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String razonSocial;
    @Enumerated(EnumType.STRING)
    private TipoPersona tipoPersona;
    private String nif;
    private String email;
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String ciudad;
    private String provincia;
    private String pais;
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;
    private Integer diasPago;
    private String cuentaBancaria;
    private Boolean activo;
    private LocalDate fechaCreacion;
    private LocalDate fechaBaja;
    private String observaciones;
}