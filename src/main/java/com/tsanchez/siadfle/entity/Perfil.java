package com.tsanchez.siadfle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table (name = "perfil")
@Getter
@Setter
@NoArgsConstructor
public class Perfil {

    @Id
    @Column(name = "id_perfil")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idPerfil;

    @Column(name = "descripcion",
            length = 50,
            nullable = true)
    public String descipcion;

    @OneToMany(mappedBy = "perfil")  // La relación está gestionada desde la entidad PerfilMenu
    private List<PerfilMenu> perfilMenus;

    @OneToMany(mappedBy = "perfil")
    public List <UsuarioPerfil> usuarioPerfils;

}