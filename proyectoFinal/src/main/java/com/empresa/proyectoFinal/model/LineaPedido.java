package com.empresa.proyectoFinal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class LineaPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @Getter
    @Setter
    private int cantidad;

    @ManyToOne
    @Getter
    @Setter
    private Producto producto;
}
