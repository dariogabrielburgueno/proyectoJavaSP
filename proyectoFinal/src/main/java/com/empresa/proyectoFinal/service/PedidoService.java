package com.empresa.proyectoFinal.service;

import com.empresa.proyectoFinal.exception.StockInsuficienteException;
import com.empresa.proyectoFinal.model.LineaPedido;
import com.empresa.proyectoFinal.model.Pedido;
import com.empresa.proyectoFinal.model.Producto;

import com.empresa.proyectoFinal.repository.PedidoRepository;
import com.empresa.proyectoFinal.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public Pedido crearPedido(List<LineaPedido> lineaPedido) {
        double total=0.0;
        for (LineaPedido lp : lineaPedido) {
            Producto p = productoRepository.findById(lp.getProducto().getId()).orElse(null);
            if (p == null || p.getStock()<lp.getProducto().getStock()) {
                throw new StockInsuficienteException("Stock insuficiente");
            }
            p.setStock(lp.getProducto().getStock() - p.getStock());

            productoRepository.save(p);
            total+=p.getPrecio()*lp.getCantidad();


        }
        Pedido pedido = new Pedido();
        pedido.setTotal(total);
        pedido.setEstadoPedido("Pendiente");
        pedido.setFecha(LocalDate.now());
        pedido.setLineaPedido(lineaPedido);

        return pedidoRepository.save(pedido);


    }


}
