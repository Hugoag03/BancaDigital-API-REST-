package com.banca.digital.repositories;

import com.banca.digital.entities.OperacionCuenta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperacionCuentaRepository extends JpaRepository<OperacionCuenta, Long> {

    List<OperacionCuenta> findByCuentaBancariaId(String cuentaId);

    Page<OperacionCuenta> findByCuentaBancariaId(String cuentaId, Pageable pageable);

    Page<OperacionCuenta> findByCuentaBancariaIdOrderByFechaOperacionDesc(String cuentaId, Pageable pageable);
}
