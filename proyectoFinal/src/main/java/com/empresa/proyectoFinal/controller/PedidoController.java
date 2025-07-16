package com.empresa.proyectoFinal.controller;


import com.empresa.proyectoFinal.model.LineaPedido;
import com.empresa.proyectoFinal.model.Pedido;
import com.empresa.proyectoFinal.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;


    @PostMapping
    public Pedido crearPedido(@RequestBody List<LineaPedido> pedidos) {

        return pedidoService.crearPedido(pedidos);
    }

}
