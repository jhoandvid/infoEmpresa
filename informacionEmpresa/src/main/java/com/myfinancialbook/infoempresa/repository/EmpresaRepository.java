package com.myfinancialbook.infoempresa.repository;

import com.myfinancialbook.infoempresa.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpresaRepository extends JpaRepository <Empresa, Long> {



}
