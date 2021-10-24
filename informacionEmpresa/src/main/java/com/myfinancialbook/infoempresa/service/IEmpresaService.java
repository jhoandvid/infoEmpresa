package com.myfinancialbook.infoempresa.service;
import com.myfinancialbook.infoempresa.model.Empresa;


import java.util.List;


public interface IEmpresaService {
    public List<Empresa> findAll();
    public Empresa guardar(Empresa empresa);
    public Empresa find(Long id_empresa);




}
