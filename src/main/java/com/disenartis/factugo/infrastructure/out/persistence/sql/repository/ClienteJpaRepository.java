package com.disenartis.factugo.infrastructure.out.persistence.sql.repository;

import com.disenartis.factugo.infrastructure.out.persistence.sql.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteJpaRepository extends JpaRepository<ClienteEntity, Long> {

    List<ClienteEntity> findByActivoTrue();
}