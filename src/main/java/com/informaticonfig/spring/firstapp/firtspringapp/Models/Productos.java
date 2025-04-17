package com.informaticonfig.spring.firstapp.firtspringapp.Models;



public class Productos {
    private Long idProduct;
    private String nombre;
    private String descripcion;
    private double precio;
    
    
    public Productos(Long idProduct, String nombre, String descripcion, double precio) {
        this.idProduct = idProduct;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }


    public Long getIdProduct() {
        return idProduct;
    }


    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
