package com.empresa.proyectoFinal.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL)
    private List<LineaPedido> lineaPedido;
    @Getter
    @Setter
    private double total;
    @Getter
    @Setter
    private LocalDate fecha;
    @Getter
    @Setter
    private String estadoPedido;

}
