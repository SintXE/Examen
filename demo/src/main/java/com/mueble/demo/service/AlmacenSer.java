package com.mueble.demo.service;

import com.mueble.demo.entity.Almacen;


import java.util.List;

public interface AlmacenSer {

    public Almacen actualizar(Almacen almacen);
    public Almacen registrar(Almacen almacen);
    public void eliminar(Almacen almacen);
    public List<Almacen> ver();
}
