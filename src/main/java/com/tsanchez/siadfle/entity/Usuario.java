package com.tsanchez.siadfle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(name = "id_usuario", length = 20)
    public String idusuario;

    @Column(name = "nombre", length = 20)
    public String nombre;

    @Column(name = "apellido", length = 20)
    public String apellido;

    @Column(name = "contrasenia", length = 20)
    public String contrasenia;

    @OneToMany(mappedBy = "usuarioCreador")
    public List <CatUnidad> catUnidadesCreadas;

    @OneToMany(mappedBy = "usuarioModificador")
    public List <CatUnidad> catUnidadesModif;

    @OneToMany(mappedBy = "usuario")
    public List<UsuarioPerfil> usuarioPerfils;

}
