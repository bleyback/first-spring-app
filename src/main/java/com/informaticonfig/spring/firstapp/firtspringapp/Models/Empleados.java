package com.informaticonfig.spring.firstapp.firtspringapp.Models;



public class Empleados {
    private String nombre, apellido, puesto;
    private int edad, id;
    private double salario;


    public Empleados(String nombre, String apellido, String puesto, int edad, int id, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.edad = edad;
        this.id = id;
        this.salario = salario;
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


    public String getPuesto() {
        return puesto;
    }


    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
