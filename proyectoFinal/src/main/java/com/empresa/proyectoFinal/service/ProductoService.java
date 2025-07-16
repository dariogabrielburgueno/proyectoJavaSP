package com.empresa.proyectoFinal.service;

import com.empresa.proyectoFinal.model.Producto;
import com.empresa.proyectoFinal.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProducto(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public void agregarProducto(Producto producto) {
        productoRepository.save(producto);
    }
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }


    public Producto actualizar(Long id, Producto producto) {
        Producto p=obtenerProducto(id);
        if(p!=null) {
            p.setNombre(producto.getNombre());
            p.setDescripcion(producto.getDescripcion());
            p.setPrecio(producto.getPrecio());
            return productoRepository.save(p);}

        return null;

    }






}
