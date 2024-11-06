package com.tsanchez.siadfle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table (name = "menu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @Column (name = "id_menu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMenu;

    @Column(name = "descripcion",
            length = 50,
            nullable = true)
    public String descipcion;

    @OneToMany(mappedBy = "menu")  // La relación está gestionada desde la entidad PerfilMenu
    private List<PerfilMenu> perfilMenus;


}
