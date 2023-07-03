package com.mueble.demo.controller;

import com.mueble.demo.entity.Almacen;
import com.mueble.demo.entity.Cliente;
import com.mueble.demo.service.AlmacenSer;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/almacen")

public class AlmacenCont {
    @Autowired
    AlmacenSer almacenSer;

    @GetMapping
    public List<Almacen> Ver(){
        return almacenSer.ver();
    }

    @PutMapping
    public Almacen actualizar (@RequestBody Almacen almacen){
        return almacenSer.actualizar(almacen);
    }

    @PostMapping
    public Almacen registrar(@RequestBody Almacen almacen){
        return almacenSer.registrar(almacen);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@RequestBody Almacen almacen){
        almacenSer.eliminar(almacen);
    }
}


