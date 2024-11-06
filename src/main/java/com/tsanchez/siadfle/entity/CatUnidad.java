package com.tsanchez.siadfle.entity;

import com.tsanchez.siadfle.entity.comun.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cat_unidad")
public class CatUnidad  extends BaseEntity {

    @Column(name = "id_unidad")
    @Id  // @Id se ocupa para indicar la llave
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // para autogenerar el valor de la llave
    public int idUnidad ;

    @ManyToOne
    @JoinColumn(name = "id_tipo_unidad")
    public CatTipoUnidad catTipoUnidad;

    @Column(name = "marca")
    public String marca;

    @Column(name = "modelo")
    public String modelo;

    @Column(name = "anio")
    public String anio;

    @Column(name = "placa")
    public String placa;

    @Column(name = "color")
    public String color;

    @Column(name = "medidas_caja")
    public String medidadCaja;

}


