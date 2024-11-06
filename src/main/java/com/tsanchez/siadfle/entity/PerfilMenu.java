package com.tsanchez.siadfle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "perfil_menu")
@Getter
@Setter
@NoArgsConstructor
public class PerfilMenu {

    @Id
    @Column (name = "id_perfil_menu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idPerfilMenu;

    // Relación muchos a uno con Perfil
    @ManyToOne
    @JoinColumn(name = "perfil_id")  // Clave foránea que refiere a Perfil
    private Perfil perfil;

    // Relación muchos a uno con Menu
    @ManyToOne
    @JoinColumn(name = "menu_id")  // Clave foránea que refiere a Menu
    private Menu menu;

}
