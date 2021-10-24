package com.myfinancialbook.infoempresa.rest;

import com.myfinancialbook.infoempresa.model.Empresa;
import com.myfinancialbook.infoempresa.repository.EmpresaRepository;
import com.myfinancialbook.infoempresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/financial")
public class EmpresaRest {

    @Autowired
    private EmpresaService empresaService;

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Empresa>> getEmpresa() {
        return ResponseEntity.ok().body(empresaService.findAll());
    }


    @PostMapping("/agregar")
    Empresa create(@RequestBody Empresa empresa){
        return empresaService.guardar(empresa);
    }


    @PutMapping("/modificar/{id_empresa}")
    Empresa update(@PathVariable("id_empresa") Long id_empresa, @RequestBody Empresa empresa) {
        Empresa empresaedit = empresaService.find(id_empresa);
        if (empresaedit == null) {
            return null;
        }
        empresaedit.setNombre(empresa.getNombre());
        empresaedit.setNit(empresa.getNit());
        empresaedit.setDireccion(empresa.getDireccion());
        empresaedit.setCorreo(empresa.getCorreo());
        empresaedit.setDescripcion(empresa.getDescripcion());
        empresaedit.setTelefono(empresa.getTelefono());
        return empresaService.guardar(empresaedit);
    }
    @DeleteMapping ("/eliminar/{id_empresa}")
    void delete(@PathVariable Long id_empresa) {
        Empresa empresaElimi = empresaRepository.findById(id_empresa).orElseThrow(RuntimeException::new);
        empresaRepository.delete(empresaElimi);
    }

}
