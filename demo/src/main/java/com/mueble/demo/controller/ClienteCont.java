package com.mueble.demo.controller;

import com.mueble.demo.entity.Cliente;

import com.mueble.demo.service.ClienteSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //reconoce la clase controllador
@RequestMapping("/Cliente") //esto ingresa a la direccion que deses enviar
public class ClienteCont {


    @Autowired
    ClienteSer clienteSer;


    @GetMapping
    public List<Cliente> Ver(){
        return clienteSer.ver();
    }

    @PutMapping
    public Cliente actualizar (@RequestBody Cliente cliente){
        return clienteSer.actualizar(cliente);
    }

    @PostMapping
    public Cliente registrar(@RequestBody Cliente cliente){
        return clienteSer.registrar(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@RequestBody Cliente cliente){
        clienteSer.eliminar(cliente);
    }
}