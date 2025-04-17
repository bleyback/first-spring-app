package com.informaticonfig.spring.firstapp.firtspringapp.services;

import java.util.List;

import com.informaticonfig.spring.firstapp.firtspringapp.Models.Productos;
import com.informaticonfig.spring.firstapp.firtspringapp.repositorios.Repo_Productos;

public class Services_Producto {
    
    private Repo_Productos repoProductos= new Repo_Productos();


    public List<Productos> getProductos() {
        return repoProductos.getProductos();
    }
    public Productos getProductoById(Long idProduct) {
        return repoProductos.getProductoById(idProduct);
    }
    
    public void addProducto(Productos producto) {
        repoProductos.addProducto(producto);
    }
    public String removeProducto(Long idProduct) {
        return repoProductos.removeProducto(idProduct);
    }
    public void updateProducto(Productos producto) {
        repoProductos.updateProducto(producto);
    }
    public void setRepoProductos(Repo_Productos repoProductos) {
        this.repoProductos = repoProductos;
    }
    public Repo_Productos getRepoProductos() {
        return repoProductos;
    }

}
