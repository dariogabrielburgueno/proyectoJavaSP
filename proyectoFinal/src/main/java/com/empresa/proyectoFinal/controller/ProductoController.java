package com.empresa.proyectoFinal.controller;

import com.empresa.proyectoFinal.model.Producto;
import com.empresa.proyectoFinal.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarTodos();
    }
    @GetMapping("/{id}")
    public Producto buscarProducto(@PathVariable Long id) {
        return productoService.obtenerProducto(id);
    }

    @PostMapping
    public void agregarProducto(@RequestBody Producto producto) {
        productoService.agregarProducto(producto);
    }
    @PutMapping("/{id}")
    public void modificarProducto(@RequestBody Producto producto) {
        productoService.actualizar(producto.getId(), producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}
