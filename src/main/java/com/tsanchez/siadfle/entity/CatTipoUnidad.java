package com.tsanchez.siadfle.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.List;

@Entity
@Table (name = "cat_tipo_unidad")
public class CatTipoUnidad {

    @Column (name = "id_tipo_unidad")
    @Id  // @Id se ocupa para indicar la llave
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // para autogenerar el valor de la llave
    public int idTipoUnidad ;

    @Column (name = "tipo_unidad", length = 30, nullable = false)
    @NotEmpty
    @NotBlank
    public String tipoUnidad ;

    @Column (name = "capacidad", length = 30, nullable = false)
    @NotEmpty
    @NotBlank
    public String capacidad ;

    @Column (name = "observaciones", length = 30)
    public String observaciones ;

    @OneToMany (mappedBy = "catTipoUnidad")
    private List <CatUnidad> catUnidad;
}
