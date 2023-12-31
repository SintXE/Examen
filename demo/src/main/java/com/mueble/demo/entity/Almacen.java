package com.mueble.demo.entity;

import jakarta.persistence.*;

@Entity
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id ;

    public String tipo;

    public String clase;

    public String modelo;

    public Almacen(){}

    public Almacen(Long id, String tipo, String clase, String modelo){
        Id = id;
        this.tipo = tipo;
        this.clase = clase;
        this.modelo = modelo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return "Almacen{" +
                "Id=" + Id +
                ", tipo='" + tipo + '\'' +
                ", clase='" + clase + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
