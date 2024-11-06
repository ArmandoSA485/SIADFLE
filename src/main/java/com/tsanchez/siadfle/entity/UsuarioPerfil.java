package com.tsanchez.siadfle.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_perfil")
public class UsuarioPerfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_perfil")
    public int idUsuarioPerfil;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    public Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_perfil")
    public Perfil perfil;

}
