package com.myfinancialbook.infoempresa.service;

import com.myfinancialbook.infoempresa.model.Empresa;
import com.myfinancialbook.infoempresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService implements IEmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa guardar(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa find(Long id_empresa) {
        return empresaRepository.findById(id_empresa).orElse(null);
    }



}
