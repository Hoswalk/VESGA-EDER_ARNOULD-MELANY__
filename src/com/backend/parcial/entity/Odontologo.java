package com.backend.parcial.entity;

public class Odontologo {
    private int id;
    private String numero;
    private String nombre;
    private String apellido;


    public Odontologo(String numero, String nombre, String apellido) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(int id, String numero, String nombre, String apellido) {
        this.id = id;
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}