package com.mueble.demo.service;

import com.mueble.demo.entity.Cliente;
import com.mueble.demo.repository.ClienteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClienteSer {
    //creamos las funciones que realizara nuestro CRUD

    public Cliente actualizar(Cliente cliente);
    public Cliente registrar(Cliente cliente);
    public void eliminar(Cliente cliente);
    public List<Cliente> ver();
}