package com.bruno.msclientes.infra.repository;

import com.bruno.msclientes.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}