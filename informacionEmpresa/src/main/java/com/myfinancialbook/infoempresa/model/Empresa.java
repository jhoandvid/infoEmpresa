package com.myfinancialbook.infoempresa.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="empresa")
@Getter
@Setter
@ToString
public class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_empresa;

    @NotEmpty(message = "el nombre de la empresa no puede estar vacio")
    private String nombre;

    @NotEmpty(message = "el registro unico de la empresa no puede estar vacia")
    @Column(unique = true)
    private String nit;


    @Column(unique = true)
    @NotEmpty(message = "la direccion de la empresa no puede estar vacia")
    private String direccion;

    @NotEmpty(message = "el correo de la empresa no puede estar vacia")
    private String correo;

    @NotEmpty(message = "la descripcion de la empresa no puede estar vacia")
    private String descripcion;

    @NotEmpty (message = "el telefono de la empresa no puede estar vacia")
    @Column(unique = true)
    private String telefono;




}
