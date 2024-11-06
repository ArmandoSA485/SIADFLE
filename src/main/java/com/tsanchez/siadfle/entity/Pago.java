package com.tsanchez.siadfle.entity;

import com.tsanchez.siadfle.entity.comun.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "pago")
@Getter
@Setter
@NoArgsConstructor
public class Pago extends BaseEntity {

    @Column(name = "id_pago")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idPago;

    @Column(name = "monto")
    public double monto;

    @Column(name = "comprobante")
    public String comprobante;
}
