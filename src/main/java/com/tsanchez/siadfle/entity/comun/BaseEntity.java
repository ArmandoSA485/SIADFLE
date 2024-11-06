package com.tsanchez.siadfle.entity.comun;

import com.tsanchez.siadfle.entity.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass  // Esto indica que no se mapeará como una tabla directamente
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity {

    @ManyToOne
    @JoinColumn (name = "creado_por")
    private Usuario usuarioCreador;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn (name = "modificado_por")
    private Usuario usuarioModificador;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

}