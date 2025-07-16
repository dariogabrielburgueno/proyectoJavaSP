package com.empresa.proyectoFinal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/usuario")
    public String index(){
        return "Hola Mundo";
    }
}
